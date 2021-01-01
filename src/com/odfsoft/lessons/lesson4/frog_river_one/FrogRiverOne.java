package com.odfsoft.lessons.lesson4.frog_river_one;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int X, int[] A) {
        Set<Integer> requiredLeaves = new HashSet<>();
        for(int i=1; i<=X; i++) {
            requiredLeaves.add(i);
        }
        for(int i = 0; i < A.length; i++) {
            requiredLeaves.remove(A[i]);
            if(requiredLeaves.isEmpty()) {
                return i;
            }
        }
        return -1;
    }

}
