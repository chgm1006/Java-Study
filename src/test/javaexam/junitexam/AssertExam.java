package javaexam.junitexam;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Forrest on 2017. 1. 3..
 */
public class AssertExam {
    @Test
    public void assertEqualsExam() {
        int x = 3;
        assertEquals(3, x);
        x = 4;
        assertEquals("x는 3이 아님", 3, x);
    }

    @Test
    public void assertArrayEqualsExam() {
        int[] expected = {1, 2, 3};
        int[] x = {3, 3, 3};
        assertArrayEquals("x가 배열 {1, 2, 3}이 아님", expected, x);
    }

    @Test
    public void assertThatExam() {
        int x = 3;
        assertThat(x, is(3));

    }

    @Test
    public void assertTrueExam() {
        boolean expected = true;
        assertTrue(expected);
        assertTrue("expected가 true가 아님", !expected);
    }

    @Test
    public void assertFalseExam() {
        boolean expected = false;
        assertFalse(expected);
        assertFalse("expected가 false가 아님", !expected);

    }
}
