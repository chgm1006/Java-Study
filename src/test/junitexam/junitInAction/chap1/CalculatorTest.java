package junitexam.junitInAction.chap1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Forrest on 2017. 1. 4..
 */
public class CalculatorTest {
    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);

        assertEquals(60, result, 0);

    }

}