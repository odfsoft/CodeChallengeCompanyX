package com.odfsoft.lessons.lesson6.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    void test1() {
        int result = new Triangle().solution(new int[] {10, 2, 5, 1, 8, 20});

        assertEquals(1, result);
    }

    @Test
    void test2() {
        int result = new Triangle().solution(new int[] {10, 50, 5, 1});

        assertEquals(0, result);
    }
}