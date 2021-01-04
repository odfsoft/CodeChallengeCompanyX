package com.odfsoft.lessons.lesson7.nesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NestingTest {

    @Test
    void test1() {
        int result = new Nesting().solution("(()(())())");

        assertEquals(1, result);
    }

    @Test
    void test2() {
        int result = new Nesting().solution("())");

        assertEquals(0, result);
    }
}