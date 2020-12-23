package com.odfsoft.multivatin;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultivitaminTest {

    @Test
    public void test1() {
        Multivitamin multivitamin = new Multivitamin();

        int result = multivitamin.solution(new int[] {10, 2, 1, 1}, new int[] {10, 3, 2, 2});
        // 1, 1, 2, 10 -> 1, 2, 4, 14

        assertEquals(2, result);
    }

    @Test
    public void test2() {
        Multivitamin multivitamin = new Multivitamin();

        int result = multivitamin.solution(new int[] { 1, 2, 3, 4}, new int[] {3, 6, 4, 4});
        // 1, 3, 6, 10 - >
        assertEquals(3, result);
    }

    @Test
    public void test3() {
        Multivitamin multivitamin = new Multivitamin();

        int result = multivitamin.solution(new int[] {2, 3}, new int[] {3, 4});

        assertEquals(1, result);
    }

    @Test
    public void test4() {
        Multivitamin multivitamin = new Multivitamin();

        int result = multivitamin.solution(new int[] {1, 1, 5}, new int[] {6, 5, 8});
        // 5, 4, 3 -> 1, 2, 7
        assertEquals(3, result);
    }

    @Test
    public void test5() {
        Multivitamin multivitamin = new Multivitamin();

        int result = multivitamin.solution(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1 , 1 ,1 ,1, 1},
                new int[] {13, 13, 13, 13, 13, 13, 13, 13, 13 , 13 ,13 ,13 , 13});

        assertEquals(13, result);
    }

    @Test
    public void test6() {
        Multivitamin multivitamin = new Multivitamin();

        int result = multivitamin.solution(new int[] {1, 3, 2, 2, 1}, new int[] {4, 3, 3, 1, 1});
        // 3, 0, 1, 0, 0 : 1, 2, 4, 6, 9

        assertEquals(3, result);
    }

    @Test
    public void test7() {
        Multivitamin multivitamin = new Multivitamin();

        int result = multivitamin.solution(new int[] {1, 2, 5}, new int[] {9, 3, 6});
        // 8,1,1:  1, 3, 8 ->

        assertEquals(3, result);
    }

    @Test
    public void test8() {
        Multivitamin multivitamin = new Multivitamin();

        int result = multivitamin.solution(new int[] {5, 3, 8}, new int[] {6, 4, 9});
        // 1, 1, 1:  3, 8, 16 ->

        assertEquals(1, result);
    }

    @Test
    public void testBig() {
        Multivitamin multivitamin = new Multivitamin();

        int[] juices = IntStream.range(0, 100_000)
                .toArray();
        int[] capacities = IntStream.range(0, 100_000)
                .map(x -> 100_0000_000)
                .toArray();

        System.out.println(Integer.MAX_VALUE);

        int result = multivitamin.solution(juices, capacities);
        // 1, 1, 1:  3, 8, 16 ->

        assertEquals(44721, result);
    }
}