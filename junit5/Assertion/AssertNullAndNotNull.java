package com.sagar.junit5.Assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertNullAndNotNull {
    @Test
    void testCase()
    {
        String nullString = null;
        String notNullString = "dodamani";

        //Test will pass
        Assertions.assertNotNull(notNullString);

        //Test will fail
        Assertions.assertNotNull(notNullString);

        //Test will pass
       // Assertions.assertNull(nullString);

        // Test will fail
        //Assertions.assertNull(notNullString);
    }
}
