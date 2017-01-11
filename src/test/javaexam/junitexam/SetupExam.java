package javaexam.junitexam;

import org.junit.jupiter.api.*;

/**
 * Junit5 버전으로 테스트
 */
public class SetupExam {
    /**
     * Junit4의 @Before와 같다.
     */
    @BeforeEach
    public void setUp() {
        System.out.println("--------- Start ---------");
    }

    /**
     * @{@link AfterEach}는 테스트 메소드가 종료되면 실행된다.
     * Junit4의 @{@link After}와 같다.
     */
    @AfterEach
    public void tearDown() {
        System.out.println("--------- End ---------");

    }

    @Test
    public void testA() {
        System.out.println("--------- testA() 실행 ---------");
    }

    /**
     * @{@link Disabled}는 테스트 메소드를 실행하지 않는다.
     * Junit4의 @{@link Ignore}와 같다.
     */
    @Disabled
    @Test
    public void testB() {
        System.out.println("--------- testB() 실행 ---------");
    }

    @Test
    public void testC() {
        System.out.println("--------- testC() 실행 ---------");

    }

    /**
     * @{@link BeforeAll}은 테스트 클래스가 실행 될때 가장 먼저 한번만 실행 된다.
     * Junit4의 @{@link BeforeClass} 와 같다.
     */
    @BeforeAll
    public static void beforeAll() {
        System.out.println("--------- BeforeAll ---------");
    }

    /**
     * @{@link AfterAll}은 테스트 클래스가 실행 될 때 마지막에 한번만 실행 된다.
     * Junit4의 @{@link AfterClass}와 같다.
     */
    @AfterAll
    public static void afterAll() {
        System.out.println("--------- AfterAll ---------");
    }

}
