package com.odfsoft.lessons.lesson8.dominator;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public int solution(int[] A) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for(int i=0; i<A.length; i++) {
            int counter = occurrences.getOrDefault(A[i], 0) + 1;
            if(counter > A.length / 2) {
                return i;
            } else {
                occurrences.put(A[i], counter);
            }
        }

        return -1;
    }
}
