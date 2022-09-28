package com.sagar.junit5.Assertion;

import com.sagar.junit5.A3.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertEqualsAndNotEquals {
    @Test
    void test()
    {
        //Test will pass
        Assertions.assertEquals(4, Calculator.add(2, 2));

        //Test will pass
        Assertions.assertNotEquals(4, Calculator.add(2, 2), "Calculator.add(2, 2) test failed");


    }
}
