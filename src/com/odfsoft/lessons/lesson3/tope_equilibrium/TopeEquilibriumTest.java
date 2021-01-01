package com.odfsoft.lessons.lesson3.tope_equilibrium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopeEquilibriumTest {

    @Test
    public void test1() {
        int result = new TopeEquilibrium().solution(new int[] {3, 1, 2, 4, 3});

        assertEquals(1, result);
    }

    @Test
    public void test2() {
        int result = new TopeEquilibrium().solution(new int[] {5, 6, 2, 4, 1});

        assertEquals(4, result);
    }

    @Test
    public void test3() {
        int result = new TopeEquilibrium().solution(new int[] {-1000, 1000});

        assertEquals(2000, result);
    }

    @Test
    public void test4() {
        int result = new TopeEquilibrium().solution(new int[] {-1000, 1000, 1});

        assertEquals(1, result);
    }
}