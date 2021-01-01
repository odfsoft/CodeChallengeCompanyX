package com.odfsoft.companies.x.burgers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcerciseTest {

    @Test
    public void test() {
        Excercise test = new Excercise();

        int[] sol = test.solution(1, 2);

        assertEquals(1, sol[0]);
        assertEquals(0, sol[1]);
    }

    @Test
    public void test2() {
        Excercise test = new Excercise();

        int[] sol = test.solution(7, 16);

        assertEquals(6, sol[0]);
        assertEquals(1, sol[1]);
    }

    @Test
    public void test3() {
        Excercise test = new Excercise();

        int[] sol = test.solution(15, 40);

        assertEquals(10, sol[0]);
        assertEquals(5, sol[1]);
    }

}