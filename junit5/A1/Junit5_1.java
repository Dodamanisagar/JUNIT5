package com.sagar.junit5.A1;

import org.junit.jupiter.api.*;

public class Junit5_1 {

    @BeforeAll
    public static void beforeAll()
    {
        System.out.println("testcase beforAll");
    }
    @BeforeEach
    public void beforeEach()
    {
        System.out.println("testcase before each 1");
    }


    @Test
    public void testcase1()
    {
        System.out.println("testcase 1");
    }

    @Test
    @DisplayName("2nd test case")
    //@RepeatedTest(value = 5, name = "{displayName} - repetition {currentRepetition} of {totalRepetitions}")
    public void testCase2()
    {
        System.out.println("tastcase2");
    }

    @AfterEach
    public void afterEach()
    {
        System.out.println("testcase After Each");
    }

    @AfterAll
    public static void afterAll()
    {
        System.out.println("testcase afterAll");
    }

}
