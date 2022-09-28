package com.sagar.junit5.Assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertSameAndNotSame {
    @Test
    void testCase()
    {

        String originalObject = "email.com";
        String cloneObject = originalObject;
        String otherObject = "example.com";

        //Test will pass
        //Assertions.assertNotSame(originalObject, otherObject);

        //Test will fail
       Assertions.assertNotSame(originalObject, cloneObject);

        //Test will pass
        //Assertions.assertSame(originalObject, cloneObject);

        // Test will fail
        Assertions.assertSame(originalObject, otherObject);
    }
}
