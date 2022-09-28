package com.sagar.junit5.ExecutionOredrByClass;

import org.junit.jupiter.api.*;

@TestClassOrder(ClassOrderer.Random.class)
public class OrderByRandomClass {
    @Nested
    class SetupTests {

        @Test
        void test1() {
        }
    }

    @Nested
    class AppFlowTests {

        @Test
        void test2() {
        }
    }
}
