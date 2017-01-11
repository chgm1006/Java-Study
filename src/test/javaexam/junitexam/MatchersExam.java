package javaexam.junitexam;

import junitexam.junitInAction.chap1.Calculator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumingThat;

/**
 * Created by Forrest on 2017. 1. 11..
 */
public class MatchersExam {

    @Test
    public void testMatchers() {
        int x = 3;
        assertSame(x, is(3));

        assumingThat(x != 0, () -> System.out.println("True"));
    }

    @Test
    public void testNull() {

        String x = null;
        assertSame(x, is(nullValue()));

        x = "";
        assertSame(x, is(notNullValue()));
    }

    @Test
    public void testString() {
        String s = "asserta";
        assertThat(s, containsString("a"));

        assertThat(s, startsWith("a"));

        assertThat(s, endsWith("a"));
    }

    @Test
    public void testString2() {
        assertThat("Hello", both(containsString("e")).and(containsString("o")));

        assertThat("Hello", either(containsString("e")).or(containsString("f")));

        assertThat("Hello", allOf(is("Hello"), startsWith("H"), endsWith("o")));

        assertThat("Hello", anyOf(is("He"), startsWith("H"), endsWith("!")));
    }

    @Test
    public void testInstance() {
        MatchersExam x = new MatchersExam();
        assertThat(x, is(instanceOf(MatchersExam.class)));

        MatchersExam y = x;
        assertThat(x, is(sameInstance(y)));
    }

    @Test
    public void testCollection() {
        List<String> list = Arrays.asList("a", "s", "s", "e", "r", "t");
        assertThat(list, hasItem("a"));

        assertThat(list, hasItems("a", "e", "t"));
    }

    @Test
    public void testException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> Calculator.divide(2, 0));
        assertEquals("a message", exception.getMessage());
    }

}
