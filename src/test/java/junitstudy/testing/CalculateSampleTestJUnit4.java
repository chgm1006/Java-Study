package junitstudy.testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateSampleTestJUnit4 {
    CalculateSample sample;

    @Before
    public void setUp()  {

        sample = new CalculateSample(1, 0);
    }

    @After
    public void tearDown()  {

        sample = null;
    }

    @Test
    public void testGetSum()  {
        assertEquals(1, sample.getSum());
    }

    @Test
    public void testGetAverage()  {
        assertEquals(0.5, sample.getAverage(), 1);
    }

    @Test
    public void testGetMultiply() {
        assertEquals(0, sample.getMultiply());
    }

    @Test(expected = Exception.class)
    public void testGetDivide() throws Exception {
        assertEquals(0, sample.getDivide(), 0.1);
    }
}