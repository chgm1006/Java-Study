package javaexam.junitexam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Junit5 버전으로 테스트
 */
public class AssumeExam {
    /**
     * 테스트를 실시할 때 전제 조건에 근거하여 테스트 케이스를 실행할 때 {@link org.junit.jupiter.api.Assumptions} 클래스를 사용한다.
     */
    @DisplayName("Assume 테스트 케이스")
    @Test
    public void testAssume() {
        assumeTrue(System.getProperty("os.name").contains("Mac"));

        Assertions.assertSame(System.getProperty("line.separator"), "\n");
    }

    public static void main(String[] args) {
        Properties properties = System.getProperties();

        Set<Map.Entry<Object, Object>> entries = properties.entrySet();

        Iterator<Map.Entry<Object, Object>> iterator = entries.iterator();

        for (Map.Entry<Object, Object> entry : entries) {
            System.out.println(entry.getKey() + " :: " + entry.getValue());
        }
    }
}
