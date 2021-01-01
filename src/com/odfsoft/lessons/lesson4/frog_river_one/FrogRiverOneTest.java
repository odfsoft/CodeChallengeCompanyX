package com.odfsoft.lessons.lesson4.frog_river_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogRiverOneTest {

    @Test
    public void test1() {

        int result = new FrogRiverOne().solution(5, new int[] {1, 3 ,1, 4, 2, 3, 5, 4});

        assertEquals(6, result);
    }

    @Test
    public void test2() {

        int result = new FrogRiverOne().solution(5, new int[] {3});

        assertEquals(-1, result);
    }

}