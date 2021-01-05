package com.odfsoft.lessons.lesson9.max_double_slice;

public class MaxDoubleSlice {
    public int solution(int[] A) {
        int N = A.length;
        int[] maxSumLeftSlice = new int[N];
        int[] maxSumRightSlice = new int[N];

        for(int i = 1; i < N-1; i++){
            // A[X + 1] + A[X + 2] + ... + A[Y − 1]
            // Let's assume that Y is equal to i+1.
            // If maxSumLeftSlice[i-1] + A[i] is negative, we assign X to i.
            // It means that the slice sum is 0 because X and Y are consecutive indices.
            maxSumLeftSlice[i] = Math.max(maxSumLeftSlice[i-1] + A[i], 0);
        }
        for(int i = N-2; i > 0; i--){
            // A[Y + 1] + A[Y + 2] + ... + A[Z − 1]
            // Let's assume that Y is equal to i-1.
            // As aforementioned, Z will be assigned to i if maxSumRightSlice[i+1] + A[i]
            // is negative, and it returns 0 because Y and Z becomes consecutive indices.
            maxSumRightSlice[i] = Math.max(maxSumRightSlice[i+1]+A[i], 0);
        }

        int max = 0;

        for(int i = 1; i < N-1; i++){
            // a1, a2, ... ,startMaxLeftSlice ... startMaxRightSlice... an-2, an-1, an
            // Let's say that i is the index of Y.
            // maxSumLeftSlice[i-1] is the max sum of the left slice, and
            // maxSumRightSlice[i+1] is the max sum of the right slice.
            max = Math.max(max, maxSumLeftSlice[i-1]+maxSumRightSlice[i+1]);
        }

        return max;
    }
}
