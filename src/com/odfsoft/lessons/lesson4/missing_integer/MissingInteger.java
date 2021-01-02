package com.odfsoft.lessons.lesson4.missing_integer;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public int solution(int[] A) {
        Set<Integer> existingNumbers = new HashSet<>();
        for(int number: A) {
            existingNumbers.add(number);
        }
        int missingInteger = 1;
        while(existingNumbers.contains(missingInteger)) {
            missingInteger++;
        }
        return missingInteger;
    }

}
