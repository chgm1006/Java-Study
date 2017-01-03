package junitexam.junitInAction.chap1;

public class CalculatorTest {
    /**
     * 오래된 Test 방벙
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        if (result != 60) {
            System.out.println("Bad result :: " + result);

        }
    }
}
