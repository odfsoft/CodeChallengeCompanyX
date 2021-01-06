package com.odfsoft.lessons.lesson9.max_slice_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxSliceSumTest {

    @Test
    public void test1() {
        int result = new MaxSliceSum().solution(new int[] {3,2,-6, 4,0});

        assertEquals(5, result);
    }
}