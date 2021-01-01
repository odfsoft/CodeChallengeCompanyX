package com.odfsoft.lessons.lesson2.odd_occurrences_in_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OddOccurrencesInArrayTest {

    @Test
    public void test1() {
        int result = new OddOccurrencesInArray().solution(new int[] {9, 3, 9, 3, 9, 7, 9});

        assertEquals(7, result);
    }

}