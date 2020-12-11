package com.odfsoft.fishes;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExcerciseTest {

    @Test
    public void test() {
        Excercise test = new Excercise();

        int sol = test.solution("ABAD");

        assertEquals(3, sol);
    }

    @Test
    public void test2() {
        Excercise test = new Excercise();

        int sol = test.solution("ACCD");

        assertEquals(1, sol);
    }

    @Test
    public void test3() {
        Excercise test = new Excercise();

        int sol = test.solution("ACCCCD");

        assertEquals(1, sol);
    }

    @Test
    public void test4() {
        Excercise test = new Excercise();

        int sol = test.solution("CAAADACD");

        assertEquals(5, sol);
    }

    @Test
    public void test5() {
        Excercise test = new Excercise();

        int sol = test.solution("DDDDDACD");

        assertEquals(6, sol);
    }

    @Test
    public void test6() {
        Excercise test = new Excercise();

        int sol = test.solution("CAAADACD");

        assertEquals(5, sol);
    }

    @Test
    public void longString() {
        Excercise test = new Excercise();
        InputStream inputStream = ExcerciseTest.class.getResourceAsStream("data.txt");
        String input = readFromInputStream(inputStream);
        System.out.println("input size =" + input.length());

        int sol = test.solution(input);

        assertEquals(281460, sol);
    }

    private static String readFromInputStream(InputStream inputStream) {
        String input = null;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            if ((line = br.readLine()) != null) {
                input = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }

}