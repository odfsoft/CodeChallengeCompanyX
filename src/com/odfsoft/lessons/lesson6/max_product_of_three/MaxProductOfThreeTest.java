package com.odfsoft.lessons.lesson6.max_product_of_three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProductOfThreeTest {

    @Test
    void test1() {

        int result = new MaxProductOfThree().solution(new int[] {-3, 1, 2, -2, 5, 6});

        assertEquals(60, result);
    }

    @Test
    void test2() {

        int result = new MaxProductOfThree().solution(new int[] {-10, -2, -4});

        assertEquals(-80, result);
    }

    @Test
    void test3() {

        int result = new MaxProductOfThree().solution(new int[] {-5, 5, -5, 4});

        assertEquals(-125, result);
    }

    @Test
    void test4() {

        int result = new MaxProductOfThree().solution(new int[] {-4, -6, 3, 4, 5});

        assertEquals(120, result);
    }

}