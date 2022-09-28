package com.sagar.junit5.Assertion;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertTrueAndFalse
{
    @Test
    @DisplayName("junit5")
    void testCase()
    {
        boolean trueBool = true;
        boolean falseBool = false;

        Assertions.assertTrue(trueBool);
        //Assertions.assertTrue(falseBool, "test execution message");

        Assertions.assertFalse(falseBool);
       // Assertions.assertFalse(trueBool, "test execution message");
   }
}
