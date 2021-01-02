package com.odfsoft.lessons.lesson4.perm_check;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermCheckTest {

    @Test
    void test1() {

        int result = new PermCheck().solution(new int[] {4, 1, 3, 2});

        assertEquals(1, result);
    }

    @Test
    void test2() {

        int result = new PermCheck().solution(new int[] {4, 1, 3});

        assertEquals(0, result);
    }
}