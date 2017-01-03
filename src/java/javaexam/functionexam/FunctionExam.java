package javaexam.functionexam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

/**
 * Created by Forrest on 2016. 12. 19..
 */
public class FunctionExam {

    public static void main(String[] args) {
        Function<String, Date> toDate = s -> {

            try {
                return new SimpleDateFormat("yyyy/MM/dd").parse(s);
            } catch (ParseException e) {
                return null;
            }
        };

        Date date = toDate.apply("2016/12/19");
        System.out.println("date :: " + date);

        try {
            Date date2 = new SimpleDateFormat("yyyy/MM/dd").parse("2016/12/19");
            System.out.println("date2 :: " + date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
