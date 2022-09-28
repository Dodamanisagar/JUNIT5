package com.sagar.junit5.A2;

import org.junit.jupiter.api.*;

class  JunitTest {

    Junit junit;
    //setting up at class level
    @BeforeAll
    @Tag("basavaraj")
    static void beforeAllInit()
    {
        System.out.println("@BeforeAll setting up");
    }

    //setting up at method level
    @BeforeEach
    void init()
    {
        System.out.println("@BeforEach Setting up ");
        junit=new Junit();
    }

    //first test execution
    @Test
    @DisplayName("SAGAR")
    void testAdd()
    {
        System.out.println("first test case");
        Assertions.assertNotEquals(3,junit.add(1,5));

    }

    //second test execution
    @Test
    void testSubtract()
    {
        System.out.println("second test case");
        Assertions.assertEquals(2,junit.add(1,1));
    }


    //cleaning up at method level
    @AfterEach
    void cleanup()
    {
        System.out.println("@AfterEach Cleaning up");
    }

    //cleaning up at class level
    @AfterAll
    static void afterAllInit()
    {
        System.out.println("@AfterAll Cleaning up");
    }
}



