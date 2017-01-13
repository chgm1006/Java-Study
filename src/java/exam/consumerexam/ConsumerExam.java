package exam.consumerexam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;

/**
 * Created by Forrest on 2016. 12. 19..
 */
public class ConsumerExam {
    public static void main(String[] args) {
        Consumer<Date> print = date -> {
            String s = new SimpleDateFormat("yyyy/MM/dd").format(date);
            System.out.println(s);
        };

        print.accept(new Date());
    }
}
