package com.sagar.junit5.A3;
import org.junit.jupiter.api.*;

public class AppTest {

    @BeforeAll
    static void beforeAll2()
    {
        System.out.println("@BeforeAll2 executed");

    }

    @BeforeAll
    static void beforeAll1(){
        System.out.println("@BeforeAll1 executed");

    }

    @BeforeEach
    void beforeEach(){
        System.out.println("@BeforeEach executed");

    }

    @Tag("DEV")
    @DisplayName("FIRST TEST CASE")
    @RepeatedTest(2)
   // @Test
    void testOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
       // Assertions.assertEquals( 4 , Calculator.multiple(2, 2));

    }


    @Tag("PROD")
    @DisplayName("SECOND TEST CASE")
    //@Disabled
    @Test
    void testTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));

    }



    @Test
    @DisplayName("THIRD TEST CASE")
    public void testThree_AssertEquals()
    {
        System.out.println("======TEST THREE EXECUTED=======");
        //Test will pass
        Assertions.assertEquals(4, Calculator.add(2, 2),"test passed");

        //Test will pass
        Assertions.assertEquals(6, Calculator.add(4, 2), "Calculator.add(2, 2) test passed");

    }

    @Test    //---->giving warning for test suites
    @DisplayName("FOURTH TEST CASE")
    void testFour_AssertNotEquals()
    {
        System.out.println("======TEST FOUR EXECUTED=======");
        //Test will pass
        Assertions.assertNotEquals(3, Calculator.add(2, 2));

        //Test will pass
       // Assertions.assertNotEquals(4, Calculator.add(2, 2), "Calculator.add(2, 2) test passed");

    }

    @AfterEach
    void afterEach(){
        System.out.println("@AfterEach executed");

    }

    @AfterAll
    static void afterAll1(){
        System.out.println("@AfterAll1 executed");

    }

    @AfterAll
    static void afterAll2(){
        System.out.println("@AfterAll2 executed");

    }

}
