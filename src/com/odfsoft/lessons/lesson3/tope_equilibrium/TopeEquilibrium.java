package com.odfsoft.lessons.lesson3.tope_equilibrium;

public class TopeEquilibrium {

    public int solution(int[] A) {
        int[] cumulativeSum =  new int[A.length];
        cumulativeSum[0] = A[0];
        int totalSum = A[0];
        for(int i = 1; i < A.length; i ++) {
            cumulativeSum[i] = cumulativeSum[i-1] + A[i];
            totalSum += A[i];
        }

        int minimal = Integer.MAX_VALUE;
        int currentSum;
        for(int i = 0; i < A.length - 1; i ++) {
            currentSum = Math.abs(cumulativeSum[i] - (totalSum- cumulativeSum[i]));
            if(minimal > currentSum) {
                minimal = currentSum;
            }
        }
        return minimal;
    }
}
