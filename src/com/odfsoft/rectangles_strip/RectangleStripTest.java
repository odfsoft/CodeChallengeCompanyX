package com.odfsoft.rectangles_strip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleStripTest {

    @Test
    public void test1() {
        RectangleStrip rectangleStrip = new RectangleStrip();

        int result = rectangleStrip.solution(new int[] {2, 3, 2, 3, 5}, new int[] {3, 4, 2, 4, 2});

        assertEquals(3, result);
    }

    @Test
    public void test2() {
        RectangleStrip rectangleStrip = new RectangleStrip();

        int result = rectangleStrip.solution(new int[] {2, 3, 1, 3}, new int[] {2, 3, 1, 3});

        assertEquals(2, result);
    }

    @Test
    public void test3() {
        RectangleStrip rectangleStrip = new RectangleStrip();

        int result = rectangleStrip.solution(new int[] {2, 10, 4, 1, 4}, new int[] {4, 1, 2, 2, 5});

        assertEquals(3, result);
    }
}