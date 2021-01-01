package com.odfsoft.companies.x.longest_consecutive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcerciseTest {

    @Test
    public void test() {
        Excercise test = new Excercise();

        int sol = test.solution(new int[] {1, 2, 3, 5, 6, 7, 8, 9});

        assertEquals(5, sol);
    }

    @Test
    public void test2() {
        Excercise test = new Excercise();

        int sol = test.solution(new int[] {5, -3, -2, -1, 0, 1, 5, 6, 7});

        assertEquals(5, sol);
    }

    @Test
    public void test3() {
        Excercise test = new Excercise();

        int sol = test.solution(new int[] {3,4,5,-2,-1,0,1,6,7});

        assertEquals(4, sol);
    }

    @Test
    public void test4() {
        Excercise test = new Excercise();

        int sol = test.solution(new int[] {2,3,12,11,10,9});

        assertEquals(4, sol);
    }

    @Test
    public void test5() {
        Excercise test = new Excercise();

        int sol = test.solution(new int[] {4,5,6,-4,-3,-2,-1,0,2,3});

        assertEquals(5, sol);
    }

    @Test
    public void test6() {
        Excercise test = new Excercise();

        int sol = test.solution(new int[] {1,3,4,-7,-8,-9,-10,-11,12,11});

        assertEquals(5, sol);
    }

    @Test
    public void test7() {
        Excercise test = new Excercise();

        int sol = test.solution(new int[] {1, 2, 3, 10, 11, 15});

        assertEquals(3, sol);
    }

    @Test
    public void test8() {
        Excercise test = new Excercise();

        int sol = test.solution(new int[] {5, 4, 2, 1});

        assertEquals(2, sol);
    }

    @Test
    public void test9() {
        Excercise test = new Excercise();

        int sol = test.solution(new int[] {3, 5, 7, 10, 15});

        assertEquals(1, sol);
    }
}