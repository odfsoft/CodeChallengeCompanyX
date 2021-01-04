package com.odfsoft.lessons.lesson8.dominator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DominatorTest {

    @Test
    public void test1() {
        int result = new Dominator().solution(new int[] {3, 4, 3, 2, 3, -1, 3, 3});

        assertEquals(0, result);
    }

}