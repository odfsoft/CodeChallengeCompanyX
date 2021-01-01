package com.odfsoft.lessons.lesson3.perm_missing_element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermMissingElementTest {

    @Test
    public void test1() {
        int result = new PermMissingElement().solution(new int[] {2, 3 ,1, 5});

        assertEquals(4, result);
    }

}