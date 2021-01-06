package com.odfsoft.lessons.lesson9.max_slice_sum;

public class MaxSliceSum {

    public int solution(int[] A) {
        int currentSum = A[0];
        int maxSum = A[0];
        for(int i=1;i<A.length;i++) {
            currentSum = Math.max(A[i], currentSum + A[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
