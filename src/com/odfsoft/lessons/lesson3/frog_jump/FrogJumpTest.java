package com.odfsoft.lessons.lesson3.frog_jump;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FrogJumpTest {

    @Test
    public void test1() {
        int result = new FrogJump().solution(10, 85, 30);

        assertEquals(3, result);
    }

}