package com.sagar.junit5.ExecutionOrderByMethod;

import com.sagar.junit5.A3.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class OrderByMethodName {


        @Test
        void aestE() {
            //Assertions.assertEquals(4, Calculator.add(2,2));
            System.out.println("ho");

        }

        @Test
        void testA() {
            Assertions.assertNotEquals(2,Calculator.add(3,4));
        }

        @Test
        void testD() {
            Assertions.assertEquals(3,Calculator.substraction(6,3));
        }

        @Test
        void testC() {
            Assertions.assertEquals(4,Calculator.multiple(2,2));
        }

        @Test
        void testB() {
            Assertions.assertEquals(4,Calculator.division(8,2));
        }
    }


