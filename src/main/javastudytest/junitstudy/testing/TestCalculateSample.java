package junitstudy.testing;

import junit.framework.TestCase;

public class TestCalculateSample extends TestCase {


    CalculateSample cs;
    private int count = 0;

    public TestCalculateSample(String methodName) {
        super(methodName);
    }

    public void setUp() throws Exception {
        super.setUp();
        cs = new CalculateSample(10, 5);
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetSum() throws Exception {
        int result = cs.getSum();
        assertEquals("더하기", 15, result);

    }

    public void testGetAverage() throws Exception {
        double result = cs.getAverage();
        assertEquals("평균", 7.5, result);

    }

    public void testGetMultiply() throws Exception {
        int result = cs.getMultiply();
        assertEquals("곱하기", 50, result);

    }

    public void testGetDivide() throws Exception {
        double result = cs.getDivide();
        assertEquals("나누기", 2.0, result);
    }
}