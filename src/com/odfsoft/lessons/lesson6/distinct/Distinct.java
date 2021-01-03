package com.odfsoft.lessons.lesson6.distinct;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public int solution(int[] A) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int i=0;i<A.length;i++) {
            uniqueNumbers.add(A[i]);
        }
        return uniqueNumbers.size();
    }
}
