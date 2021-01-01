package com.odfsoft.challenges.y2019.technetium2019;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TechnetiumTest {

    @Test
    public void test1() {
        int[][] input = {{9, 9, 7}, {9, 7, 2}, {6, 9, 5}, {9, 1, 2}};

        String result = new Technetium().solution(input);

        assertEquals("997952", result);
    }

    @Test
    public void test2() {
        int[][] input = {
                {7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7},
                {7, 7, 7, 7, 7},
                {7, 7, 7, 7,7}
        };

        String result = new Technetium().solution(input);

        assertEquals("77777777777777", result);
    }

    @Test
    public void test3() {
        int[][] input = {
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9, 9},
                {9, 9, 9, 9,9}
        };

        String result = new Technetium().solution(input);

        assertEquals("9999999999999999999", result);
    }


}