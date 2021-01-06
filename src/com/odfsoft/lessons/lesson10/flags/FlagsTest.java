package com.odfsoft.lessons.lesson10.flags;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlagsTest {

    @Test
    public void test1() {
        int result = new Flags().solution(new int[] {1,5,3,4,3,4,1,2,3,4,6,2});

        assertEquals(3, result);
    }

}