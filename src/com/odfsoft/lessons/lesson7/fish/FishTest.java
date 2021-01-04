package com.odfsoft.lessons.lesson7.fish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FishTest {

    @Test
    void test1() {
        int result = new Fish().solution(new int[] {4, 3, 2, 1, 5}, new int[] {0, 1, 0, 0, 0});

        assertEquals(2, result);
    }

    @Test
    void test2() {
        int result = new Fish().solution(new int[] {5, 3, 2, 4}, new int[] {1, 1, 1, 0});

        assertEquals(1, result);
    }
}