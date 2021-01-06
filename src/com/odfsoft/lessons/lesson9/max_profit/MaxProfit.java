package com.odfsoft.lessons.lesson9.max_profit;

public class MaxProfit {
    public int solution(int[] A) {
        int N = A.length;
        if(N < 2) return 0;

        int[] minFromLeft = new int[N];
        int[] maxFromRight = new int[N];
        minFromLeft[0] = A[0];
        for(int i=1;i<N;i++) {
            minFromLeft[i] = Math.min(minFromLeft[i-1], A[i]);
        }
        maxFromRight[N-1] = A[N-1];
        for(int i=N-2;i>=0;i--) {
            maxFromRight[i] = Math.max(maxFromRight[i+1], A[i]);
        }
        int maxProfit = 0;
        for(int i=0;i<N;i++) {
            maxProfit = Math.max(maxProfit, maxFromRight[i] - minFromLeft[i]);
        }

        return maxProfit;
    }
}
