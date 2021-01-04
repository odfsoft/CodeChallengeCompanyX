package com.odfsoft.lessons.lesson6.number_of_distinct_intersections;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public int solution(int[] A) {
        int N = A.length;
        long[] discStartPoints = new long[N];
        long[] discEndPoints = new long[N];
        for(int i=0;i<N; i++) {
            discStartPoints[i] = (long) i - A[i];
            discEndPoints[i] = (long) i + A[i];
        }

        Arrays.sort(discStartPoints);
        Arrays.sort(discEndPoints);
        int openDiscs = 0;
        int intersects = 0;
        int i=0, j=0;
        while(i < N) {
            if(discStartPoints[i] <= discEndPoints[j]) {
                intersects += openDiscs;
                if(intersects > 10E6) {
                    return -1;
                }
                openDiscs++;
                i++;
            } else {
                openDiscs--;
                j++;
            }
        }

        return intersects;
    }
}
