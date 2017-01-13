package exam;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Date date = new Date(time);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        System.out.println(cal.getTime());
    }
}
