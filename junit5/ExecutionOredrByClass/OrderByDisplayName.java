package com.sagar.junit5.ExecutionOredrByClass;

import org.junit.jupiter.api.*;

@TestClassOrder(ClassOrderer.DisplayName.class)
public class OrderByDisplayName {
    @Nested
    @DisplayName("1")
    class SetupTests {

        @Test
        void test1() {
        }
    }

    @Nested
    @DisplayName("2")
    class AppFlowTests {

        @Test
        void test2() {
        }
    }

}
