package com.odfsoft.lessons.lesson6.distinct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistinctTest {

    @Test
    void test1() {

        int result = new Distinct().solution(new int[] {2, 1, 1, 2, 3, 1});

        assertEquals(5, result);
    }
}