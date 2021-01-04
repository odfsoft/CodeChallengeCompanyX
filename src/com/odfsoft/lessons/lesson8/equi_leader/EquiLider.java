package com.odfsoft.lessons.lesson8.equi_leader;

import java.util.HashMap;
import java.util.Map;

public class EquiLider {

    public int solution(int[] A) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for(int i=0; i<A.length; i++) {
            int counter = occurrences.getOrDefault(A[i], 0) + 1;
            occurrences.put(A[i], counter);
        }

        int numberOfLeaders = 0;
        int leader = -1;
        for(int i = 0; i < A.length; i++) {
            Integer occurs = occurrences.get(A[i]);
            if(occurs > A.length / 2) {
                numberOfLeaders = occurs;
                leader = A[i];
                break;
            }
        }

        int equiLeader = 0;
        if(leader != -1) {
            int leftLeaders = 0;
            for(int i=0; i < A.length; i++) {
                if(A[i] == leader) {
                    leftLeaders++;
                }
                int rightLeaders = numberOfLeaders - leftLeaders;
                if(leftLeaders > (i + 1)/2 && rightLeaders > (A.length - (i + 1))/2) {
                    equiLeader++;
                }
            }
        }

        return equiLeader;
    }

}
