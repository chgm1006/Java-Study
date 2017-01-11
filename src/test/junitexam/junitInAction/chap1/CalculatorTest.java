package junitexam.junitInAction.chap1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.add(1, 1);

        assertEquals(2, result);

    }

}