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

    public int[] solution2(int N, int[] A) {
        int [] counters = new int[N];

        int maxCounter = 0;
        int lastResetCounter = 0;

        for(int i=0; i<A.length; i++) {
            if(A[i] <= N) {
                if(counters[A[i]-1] < lastResetCounter) {
                    counters[A[i]-1] = lastResetCounter;
                }
                counters[A[i]-1]++;
                if(counters[A[i]-1] > maxCounter) {
                    maxCounter = counters[A[i]-1];
                }
            } else {
                lastResetCounter = maxCounter;
            }
        }
        for(int i=0; i<counters.length; i++) {
            if(counters[i] < lastResetCounter) {
                counters[i]  = lastResetCounter;
            }
        }

        return counters;
    }
}
