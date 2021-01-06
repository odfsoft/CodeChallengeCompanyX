package com.odfsoft.lessons.lesson10.countFactors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountFactorsTest {

    @Test
    void test1() {
        int result = new CountFactors().solution(24);

        assertEquals(8, result);
    }

    @Test
    void test2() {
        int result = new CountFactors().solution(1);

        assertEquals(1, result);
    }
}