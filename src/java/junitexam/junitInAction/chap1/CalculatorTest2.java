package junitexam.junitInAction.chap1;

/**
 * Created by Forrest on 2017. 1. 4..
 */
public class CalculatorTest2 {
    private int nbErrors = 0;

    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 40);

        if (result != 60) {
            throw new IllegalStateException("Bad result :: " + result);
        }
    }

    public static void main(String[] args) {
        CalculatorTest2 test = new CalculatorTest2();
        try {
            test.testAdd();
        } catch (Throwable e) {
            test.nbErrors++;
            e.printStackTrace();
        }

        if (test.nbErrors > 0) {
            throw new IllegalStateException("There were " + test.nbErrors + " error(s)");
        }
    }
}
