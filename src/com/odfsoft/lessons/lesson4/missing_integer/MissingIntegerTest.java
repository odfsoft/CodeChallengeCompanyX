package com.odfsoft.lessons.lesson4.missing_integer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingIntegerTest {

    @Test
    public void test1() {

        int result = new MissingInteger().solution(new int[] {1, 3, 6, 4, 1, 2});

        assertEquals(5, result);
    }

    @Test
    public void test2() {

        int result = new MissingInteger().solution(new int[] { -1, -3 } );

        assertEquals(1, result);
    }

    @Test
    public void test3() {

        int result = new MissingInteger().solution(new int[] {1, 2, 3});

        assertEquals(4, result);
    }

}