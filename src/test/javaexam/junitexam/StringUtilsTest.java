package javaexam.junitexam;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Forrest on 2017. 1. 3..
 */
public class StringUtilsTest {
    @Test
    public void isEmpty() throws Exception {
        assertThat(StringUtils.isEmpty(null), is(true));
    }

    @Test
    public void isEmpty2() {
        assertThat(StringUtils.isEmpty(""), is(true));
    }

    @Test
    public void isEmpty3() {
        assertThat(StringUtils.isEmpty("test"), is(false));
    }

}