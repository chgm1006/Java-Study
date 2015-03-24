package junitstudy.testing;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * JUnit3 TestSuite를 이용한 Test calculate sample all.
 */
public class TestCalculateSampleAll {

    /**
     * JUnit3 TestSuite를 이용한 test.
     *
     * @return junit.framework에 있는 Test를 반환
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("Test Calculates All");
        suite.addTest(new TestCalculateSample("testGetAverage"));
        suite.addTest(new TestCalculateSample("testGetSum"));

        return suite;
    }

}