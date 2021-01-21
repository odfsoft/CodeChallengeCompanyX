package com.odfsoft.lessons.lesson10.peaks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeaksTest {

    @Test
    public void test1() {
        int result = new Peaks().solution(new int[] {1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2});

        assertEquals(3, result);
    }

    @Test
    public void test2() {
        int result = new Peaks().solution(new int[] {1, 2, 3, 4, 5, 6});

        assertEquals(0, result);
    }

}