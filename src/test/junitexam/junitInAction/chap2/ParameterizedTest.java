package junitexam.junitInAction.chap2;

import junitexam.junitInAction.chap1.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by Forrest on 2017. 1. 6..
 */
@RunWith(value = Parameterized.class)
public class ParameterizedTest {
    private double expected;
    private double valueOne;
    private double valueTwo;

    @Parameters
    public static Collection<Integer[]> getTestParameter() {
        return Arrays.asList(new Integer[][]{
                {2, 1, 1},
                {3, 2, 1},
                {4, 3, 1}
        });
    }

    public ParameterizedTest(double expected, double valueOne, double valueTwo) {
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Test
    public void sum() {
        System.out.println(expected);
        System.out.println(valueOne);
        System.out.println(valueTwo);
        Calculator calc = new Calculator();
        assertEquals(expected, calc.add(valueOne, valueTwo), 0);

    }
}
