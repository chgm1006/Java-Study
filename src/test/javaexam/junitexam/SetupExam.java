package javaexam.junitexam;

import org.junit.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

/**
 * Junit5 버전으로 테스트
 */
public class SetupExam {
    /**
     * @BeforeEach는 테스트 메소드가 실행되기 전 실행된다.
     */
    @BeforeEach
    public void setUp() {
        System.out.println("--------- Start ---------");
    }

    /**
     * @AfterEach는 테스트 메소드가 종료되면 실행된다.
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
     * @Ignore는 테스트 메소드를 실행하지 않는다.
     */
    @Ignore
    @org.junit.Test
    public void testB() {
        System.out.println("--------- testB() 실행 ---------");
    }

    @Test
    public void testC() {
        System.out.println("--------- testC() 실행 ---------");

    }

    /**
     * @BeforeAll은 테스트 클래스가 실행 될때 가장 먼저 한번만 실행 된다.
     */
    @BeforeAll
    public static void beforeAll() {
        System.out.println("--------- BeforeAll ---------");
    }

    /**
     * @AfterAll은 테스트 클래스가 실행 될 때 마지막에 한번만 실행 된다.
     */
    @AfterAll
    public static void afterAll() {
        System.out.println("--------- AfterAll ---------");
    }

}
