package exam.junitexam;


import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertSame;

/**
 * Created by Forrest on 2017. 1. 3..
 */
public class StringUtilsTest {
    @Test
    public void testIsEmpty() throws Exception {
        assertSame(StringUtils.isEmpty(null), true);
    }

    @Test
    public void testIsEmpty2() {
        assertSame(StringUtils.isEmpty(""), true);
    }

    @Test
    public void testIsEmpty3() {
        assertSame(StringUtils.isEmpty("test"), false);
    }

}