package com.sagar.junit5.ExecutionOrderByMethod;

import com.sagar.junit5.A3.Calculator;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrderByDisplayName {
    @DisplayName("a")
    @Test
    void testE() {
        //Assertions.assertEquals(4, Calculator.add(2,2));
        System.out.println("Hello development team");

    }
    @DisplayName("A")
    @Test
    void testA() {
        Assertions.assertNotEquals(2, Calculator.add(3,4));
    }
    @DisplayName("3")
    @Test
    void testD() {
        Assertions.assertEquals(3,Calculator.substraction(6,3));
    }

    @DisplayName("2")
    @Test
    void testC() {
        Assertions.assertEquals(4,Calculator.multiple(2,2));
    }

    @DisplayName("1")
    @Test
    void testB() {
        Assertions.assertEquals(4,Calculator.division(8,2));
    }
    }

