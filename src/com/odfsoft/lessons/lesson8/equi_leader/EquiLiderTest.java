package com.odfsoft.lessons.lesson8.equi_leader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EquiLiderTest {

    @Test
    void test1() {

        int result = new EquiLider().solution(new int[] {4, 3, 4, 4, 4, 2});

        assertEquals(2, result);
    }

    @Test
    void test2() {

        int result = new EquiLider().solution(new int[] {4, 4, 2, 5, 3, 4, 4, 4});

        assertEquals(3, result);
    }
}