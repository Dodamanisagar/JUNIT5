package com.sagar.junit5.ExecutionOrderByMethod;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OredrByOrderAnnotation {
    @Order(5)
    @Test
    void testE() {
        Assertions.assertTrue(true);
    }

    @Order(4)
    @Test
    void testA() {
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    void testD() {
       Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    void testC() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void testB() {
        Assertions.assertTrue(true);
    }
}
