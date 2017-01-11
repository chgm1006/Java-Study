package javaexam.junitexam;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

public class AssertExam {
    @Test
    public void testAssertEquals() {
        int x = 3;
        assertEquals(3, x);
        x = 4;
        assertEquals(3, x, "x는 3이 아님");
    }

    @Test
    public void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] x = {3, 3, 3};
        assertArrayEquals(expected, x, "x가 배열 {1, 2, 3}이 아님");
    }

    @Test
    public void testAssertThat() {
        int x = 3;
        assertSame(x, is(3));

    }

    @Test
    public void testAssertTrue() {
        boolean expected = true;
        assertTrue(expected);
        assertTrue(!expected, "expected가 true가 아님");
    }

    @Test
    public void testAssertFalse() {
        boolean expected = false;
        assertFalse(expected);
        assertFalse(!expected, "expected가 false가 아님");

    }
}
