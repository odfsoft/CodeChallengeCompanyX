package com.odfsoft.lessons.lesson10.min_perimeter_rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPerimeterRectangleTest {

    @Test
    public void test1() {

        int result = new MinPerimeterRectangle().solution(30);

        assertEquals(22, result);
    }

    @Test
    public void test2() {

        int result = new MinPerimeterRectangle().solution(1);

        assertEquals(4, result);
    }

    @Test
    public void test3() {

        int result = new MinPerimeterRectangle().solution(36);

        assertEquals(24, result);
    }

}