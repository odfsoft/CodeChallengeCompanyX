package com.odfsoft.lessons.lesson6.number_of_distinct_intersections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfDiscIntersectionsTest {

    @Test
    void test1() {
        int result = new NumberOfDiscIntersections().solution(new int[] {1, 5, 2, 1, 4, 0});

        assertEquals(11, result);
    }

    @Test
    void test2() {
        int result = new NumberOfDiscIntersections().solution(new int[] {1, 2147483647, 0});

        assertEquals(2, result);
    }
}