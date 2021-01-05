package com.odfsoft.lessons.lesson9.max_double_slice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxDoubleSliceTest {

    @Test
    void solution() {

        int result = new MaxDoubleSlice().solution(new int[] {3,2,6,-1,4,5,-1,2});

        assertEquals(17, result);
    }
}