package com.odfsoft.companies.y;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberToOrdinalTest {

    @Test
    void numberToOrdinal() {

        assertEquals("111th", NumberToOrdinal.numberToOrdinal(111));
    }
}