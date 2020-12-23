package com.odfsoft.multivatin;

import java.util.*;

public class Multivitamin {

    public int solution(int[] juice, int[] capacity) {
        Glass[] sortedJuices = new Glass[juice.length];
        for(int i = 0; i < juice.length; i++) {
            sortedJuices[i] = new Glass(juice[i], capacity[i] - juice[i]);
        }
        Arrays.sort(sortedJuices, Comparator.comparingInt(p -> p.juiceUnit));
        long[] accumulativeSum = new long[sortedJuices.length];
        accumulativeSum[0] = sortedJuices[0].juiceUnit;
        for(int i=1; i< sortedJuices.length; i++) {
            accumulativeSum[i] = accumulativeSum[i-1] + sortedJuices[i].juiceUnit;
        }

        int maxJuices = 1;
        for(int i=0; i < sortedJuices.length; i++) {
            if(sortedJuices[i].remainingCapacity > 0) {
                int left = 0;
                int right = sortedJuices.length - 1;
                int currentMax = 0;
                while (left <= right) {
                    int mid = (left + right) / 2, juices;
                    long total;
                    if (mid < i) {
                        total = accumulativeSum[mid];
                        juices = mid + 2;
                    } else {
                        total = accumulativeSum[mid] - sortedJuices[i].juiceUnit;
                        juices = mid + 1;
                    }
                    if (total <= sortedJuices[i].remainingCapacity) {
                        currentMax = Math.max(currentMax, juices);
                        left=mid+1;
                    } else {
                        right=mid-1;
                    }
                }
                maxJuices = Math.max(maxJuices, currentMax);
            }
        }
        return maxJuices;
    }

    private class Glass {

        private final int juiceUnit;
        private final int remainingCapacity;

        public Glass(int juiceUnit, int remainingCapacity) {
            this.juiceUnit = juiceUnit;
            this.remainingCapacity = remainingCapacity;
        }

        public int getJuiceUnit() { return juiceUnit; }
        public int getRemainingCapacity() { return remainingCapacity; }
    }
}
