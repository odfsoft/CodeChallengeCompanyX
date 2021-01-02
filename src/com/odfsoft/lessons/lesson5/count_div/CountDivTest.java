package com.odfsoft.lessons.lesson5.count_div;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    @Test
    public void test1() {

        int result = new CountDiv().solution(6, 11, 2);

        assertEquals(3, result);
    }

    @Test
    public void test2() {

        int result = new CountDiv().solution(0, 0, 11);

        assertEquals(1, result);
    }

    @Test
    public void test3() {

        int result = new CountDiv().solution(0, 3, 11);

        assertEquals(1, result);
    }

    @Test
    public void test4() {

        int result = new CountDiv().solution(0, 5, 2);

        assertEquals(3, result);
    }

    @Test
    public void test5() {

        int result = new CountDiv().solution(10, 10, 5);

        assertEquals(1, result);
    }

    @Test
    public void test6() {

        int result = new CountDiv().solution(0, 14, 2);

        assertEquals(8, result);
    }

}