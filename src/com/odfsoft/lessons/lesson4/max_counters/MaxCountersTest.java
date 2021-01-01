package com.odfsoft.lessons.lesson4.max_counters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MaxCountersTest {

    @Test
    public void test1() {
        int[] result = new MaxCounters().solution(5, new int[] {3, 4, 4, 6, 1, 4, 4});

        assertArrayEquals(new int[] {3, 2, 2, 4, 2}, result);
    }

    @Test
    public void test2() {
        int[] result = new MaxCounters().solution(1, new int[] {1});

        assertArrayEquals(new int[] { 1 }, result);
    }

    @Test
    public void test3() {
        int[] result = new MaxCounters().solution(18,
                new int[] {1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19, 1, 19});

        assertArrayEquals(new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 }, result);
    }

}