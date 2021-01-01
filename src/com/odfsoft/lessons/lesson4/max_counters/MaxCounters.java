package com.odfsoft.lessons.lesson4.max_counters;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int[] increments = new int[N];
        int currentMax = 0;
        int lastMax = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] == N + 1) {
                lastMax = currentMax;
            } else {
                if(increments[A[i]-1] < lastMax) {
                    increments[A[i]-1] = lastMax;
                }
                increments[A[i]-1]++;
                if(increments[A[i]-1] > currentMax) {
                    currentMax = increments[A[i]-1];
                }
            }
        }

        for(int i=0; i < increments.length; i++) {
            if(increments[i] < lastMax) {
                increments[i] = lastMax;
            }
        }

        return increments;
    }
}
