package com.odfsoft.lessons.lesson2.odd_occurrences_in_array;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        Map<Integer, Integer> pairedNumbers = new HashMap<>();
        for(int i=0; i < A.length; i++) {
            pairedNumbers.put(A[i], pairedNumbers.getOrDefault(A[i], 0)  + 1);
        }

        for(Map.Entry<Integer, Integer> entry: pairedNumbers.entrySet()) {
            if(entry.getValue() % 2 == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

}
