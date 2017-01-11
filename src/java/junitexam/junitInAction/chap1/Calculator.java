package junitexam.junitInAction.chap1;

/**
 * Created by Forrest on 2017. 1. 4..
 */
public class Calculator {
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public static void divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException();
        }
        long a = x / y;
        System.out.println("a :: " + a);
    }
}
