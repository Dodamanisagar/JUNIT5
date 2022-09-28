package com.sagar.junit5.Assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertArrayEquals {
    @Test
    void testAssertArrayEquals()
    {
        //Test will pass
        Assertions.assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3}, "Array Equal Test");

        //Test will fail because element order is different
         Assertions.assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3}, "Array Equal Test");

    }
}
