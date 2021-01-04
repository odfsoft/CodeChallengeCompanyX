package com.odfsoft.lessons.lesson7.stone_wall;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoneWallTest {

    @Test
    void test1() {
        int result = new StoneWall().solution(new int[] {4, 3, 2, 1, 5});

        assertEquals(5, result);
    }

    @Test
    void test2() {
        int result = new StoneWall().solution(new int[] {5, 4, 3});

        assertEquals(3, result);
    }

    @Test
    void test3() {
        int result = new StoneWall().solution(new int[] {4, 8, 7, 6, 5, 4});

        assertEquals(5, result);
    }

    @Test
    void test4() {
        int result = new StoneWall().solution(new int[] {4, 5, 4, 4, 4, 4});

        assertEquals(2, result);
    }

    @Test
    void test5() {
        int result = new StoneWall().solution(new int[] {8, 8, 5, 7, 9, 8, 7, 4, 8});

        assertEquals(7, result);
    }

}