package corejava.chap01;

import java.util.Random;

/**
 * Created by Forrest on 2017. 2. 7..
 */
public class RandomExam {
    public static void main(String[] args) {
        int a = new Random().nextInt()/10;
        System.out.println(a);

        int b = 1_000_000_000;
        System.out.println(b);
        System.out.println(b+"");

        double x = 1.0 / 0.0;
        System.out.println(Double.isInfinite(x));
        System.out.println(Double.isFinite(a));
    }
}
