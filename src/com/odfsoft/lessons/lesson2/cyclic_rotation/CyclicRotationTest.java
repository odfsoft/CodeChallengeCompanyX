package com.odfsoft.lessons.lesson2.cyclic_rotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyclicRotationTest {

    @Test
    public void test1() {

        int[] result = new CyclicRotation().solution(new int[] {3, 8, 9, 7, 6}, 3);

        assertArrayEquals(new int[] {9, 7, 6, 3, 8}, result);
    }

    @Test
    public void test2() {

        int[] result = new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 1);

        assertArrayEquals(new int[]{6, 3, 8, 9, 7}, result);
    }

    @Test
    public void test3() {

        int[] result = new CyclicRotation().solution(new int[] {0, 0, 0}, 1);

        assertArrayEquals(new int[] {0, 0, 0}, result);
    }

    @Test
    public void test4() {

        int[] result = new CyclicRotation().solution(new int[] {1, 2, 3, 4}, 4);

        assertArrayEquals(new int[] {1, 2, 3, 4}, result);
    }
}