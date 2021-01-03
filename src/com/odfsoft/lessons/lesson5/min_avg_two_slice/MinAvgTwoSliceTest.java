package com.odfsoft.lessons.lesson5.min_avg_two_slice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAvgTwoSliceTest {

    @Test
    public void test1() {
        int result = new MinAvgTwoSlice().solution(new int[] {4, 2, 2, 5, 1, 5, 8});

        assertEquals(1, result);
    }
}