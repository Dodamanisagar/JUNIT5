package com.sagar.junit5.ExecutionOredrByClass;

import org.junit.jupiter.api.*;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class OrderByOrderAnnotation {
    @Nested
    @Order(1)
    class SetupTests {

        @Test
        void test1() {
        }
    }

    @Nested
    @Order(2)
    class AppFlowTests {

        @Test
        void test2() {
        }
    }
}
