package com.odfsoft.lessons.lesson5.genomic_range_query;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenomicRangeQueryTest {

    @Test
    void test1() {
        int[] result = new GenomicRangeQuery().solution("CAGCCTA", new int[] {2, 5, 0}, new int[] {4, 5, 6});

        assertArrayEquals(new int[] {2, 4, 1}, result);
    }
}