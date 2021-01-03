package com.odfsoft.lessons.lesson5.passing_cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PassingCarsTest {

    @Test
    void test1() {

        int result = new PassingCars().solution(new int[] {0,1,0,1,1});

        assertEquals(5, result);
    }
}