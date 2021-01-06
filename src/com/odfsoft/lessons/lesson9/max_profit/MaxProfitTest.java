package com.odfsoft.lessons.lesson9.max_profit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxProfitTest {

    @Test
    void solution() {

        int result = new MaxProfit().solution(new int[] {23171, 21011, 21123, 21366, 21013, 21367});

        assertEquals(356, result);
    }
}