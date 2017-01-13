package exam.optionalexam;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

/**
 * Created by Forrest on 2016. 12. 16..
 */
public class OptionalExam {
    public static void main(String[] args)  {
        Optional<String> exist = Optional.of("123");
        System.out.println(exist);
        System.out.println(exist.get());

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        String value = "12345";
        Optional<String> optional = Optional.ofNullable(value);
        System.out.println(optional);
        System.out.println(optional.get());

        String value1 = optional.get();
        System.out.println("value :: " + value1);

        optional = Optional.ofNullable(null);
        String value2 = optional.orElse("");
        System.out.println("value2 :: " + value2);

        String value3 = optional.orElseGet(() -> {
            return new SimpleDateFormat("yyyyMMddHHmmSS").format(new Date());
        });
        System.out.println("value3 :: " + value3);

        String value4 = null;
        try {
            value4 = optional.orElseThrow(() -> new Exception("값이 없습니다"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("value4 :: " + value4);

        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("값이 없습니다.");
        }

        try (FileInputStream in = new FileInputStream("test.txt")) {
            System.out.println("파일생성이 완료 되었습니다.");
        } catch (Exception e) {
            System.out.println("파일생성이 완료 되지 않았습니다.");

        }
    }
}
