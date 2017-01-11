package algorithms.swapExam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by Forrest on 2017. 1. 5..
 */
public class SwapTest {
    @Test
    public void swapWithoutTemp() throws Exception {
        int[] expected = {2, 3};
        int[] actual = {3, 2};
        assertArrayEquals(Swap.swapWithoutTemp(expected), actual);
    }

    @Test
    public void swapWithTemp() throws Exception {

    }

}