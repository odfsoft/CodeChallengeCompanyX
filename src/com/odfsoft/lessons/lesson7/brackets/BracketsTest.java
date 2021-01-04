package com.odfsoft.lessons.lesson7.brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BracketsTest {

    @Test
    void test1() {
        int result = new Brackets().solution("{[()()]}");

        assertEquals(1, result);
    }

    @Test
    void test2() {
        int result = new Brackets().solution("([)()]");

        assertEquals(0, result);
    }

    @Test
    void test3() {
        int result = new Brackets().solution(")(");

        assertEquals(0, result);
    }
}