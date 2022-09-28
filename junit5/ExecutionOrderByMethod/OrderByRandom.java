package com.sagar.junit5.ExecutionOrderByMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class OrderByRandom {
    @Test
    void testE() {
        Assertions.assertTrue(true);
    }

    @Test
    void testA() {
        Assertions.assertTrue(true);
    }

    @Test
    void testD() {
        Assertions.assertTrue(true);
    }

    @Test
    void testC() {
        Assertions.assertTrue(true);
    }

    @Test
    void testB() {
        Assertions.assertTrue(true);
    }
}
