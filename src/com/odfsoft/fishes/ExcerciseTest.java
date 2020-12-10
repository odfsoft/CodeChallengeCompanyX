package com.odfsoft.fishes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcerciseTest {

    @Test
    public void test() {
        Excercise test = new Excercise();

        int sol = test.solution("ABAD");

        assertEquals(3, sol);
    }

    @Test
    public void test2() {
        Excercise test = new Excercise();

        int sol = test.solution("ACCD");

        assertEquals(1, sol);
    }

}