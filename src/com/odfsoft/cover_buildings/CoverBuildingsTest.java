package com.odfsoft.cover_buildings;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoverBuildingsTest {

    @Test
    public void test1() {
        CoverBuildings coverBuildings = new CoverBuildings();

        int result = coverBuildings.solution(new int[] {3, 1, 4});

        assertEquals(10, result);
    }

    @Test
    public void test2() {
        CoverBuildings coverBuildings = new CoverBuildings();

        int result = coverBuildings.solution(new int[] {5, 3, 2, 4});

        assertEquals(17, result);
    }

    @Test
    public void test3() {
        CoverBuildings coverBuildings = new CoverBuildings();

        int result = coverBuildings.solution(new int[] {5, 3, 5, 2, 1});

        assertEquals(19, result);
    }

    @Test
    public void test4() {
        CoverBuildings coverBuildings = new CoverBuildings();

        int result = coverBuildings.solution(new int[] {7, 7, 3, 7, 7});

        assertEquals(35, result);
    }

    @Test
    public void test5() {
        CoverBuildings coverBuildings = new CoverBuildings();

        int result = coverBuildings.solution(new int[] {1, 1, 7, 6, 6, 6});

        assertEquals(30, result);
    }

    @Test
    public void test6() {
        CoverBuildings coverBuildings = new CoverBuildings();

        int result = coverBuildings.solution(new int[] {1, 10000});

        assertEquals(10001, result);
    }

}