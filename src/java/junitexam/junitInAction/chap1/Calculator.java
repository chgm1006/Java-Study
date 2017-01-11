package junitexam.junitInAction.chap1;

public class Calculator {
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public static void divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("a message");
        }
        long a = x / y;
        System.out.println("a :: " + a);
    }
}
