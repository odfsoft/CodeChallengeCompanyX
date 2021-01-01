package com.odfsoft.lessons.lesson1.binary_gap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryGapTest {

    @Test
    public void test() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(2, binaryGap.solution(9));
    }

    @Test
    public void test2() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(4, binaryGap.solution(529));
    }

    @Test
    public void test3() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(1, binaryGap.solution(20));
    }

    @Test
    public void test4() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(0, binaryGap.solution(15));
    }

    @Test
    public void test5() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(0, binaryGap.solution(32));
    }


    @Test
    public void test6() {
        BinaryGap binaryGap = new BinaryGap();

        assertEquals(5, binaryGap.solution(1041));
    }
}