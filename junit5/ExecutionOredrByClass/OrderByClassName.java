package com.sagar.junit5.ExecutionOredrByClass;

import org.junit.jupiter.api.*;

@TestClassOrder(ClassOrderer.ClassName.class)
public class OrderByClassName {
    @Nested
    //@DisplayName("1")
    class SetupTests {

        @Test
        void test1() {
        }
    }

    @Nested
    //@DisplayName("2")
    class AppFlowTests {

        @Test
        void test2() {
        }
    }
}
