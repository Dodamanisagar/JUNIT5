package com.sagar.junit5.Assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class AssertIterableEquals {
    @Test
    void testCase()
    {
        Iterable<Integer> listOne = new ArrayList<>(Arrays.asList(1,2,3,4));
        Iterable<Integer> listTwo = new ArrayList<>(Arrays.asList(1,2,3,4));
        Iterable<Integer> listThree = new ArrayList<>(Arrays.asList(1,2,3));
        Iterable<Integer> listFour = new ArrayList<>(Arrays.asList(1,2,4,3));

        //Test will pass
        //Assertions.assertIterableEquals(listOne, listTwo);

        //Test will fail
        Assertions.assertIterableEquals(listOne, listThree);

        //Test will fail
        //Assertions.assertIterableEquals(listOne, listFour);
    }
}
