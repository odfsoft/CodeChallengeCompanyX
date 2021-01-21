package com.odfsoft.lessons.lesson10.peaks;

import java.util.ArrayList;
import java.util.List;

public class Peaks {

    public int solution(int[] A) {
        int N = A.length;
        if(N < 1) return 0;
        // Find all the peaks
        List<Integer> peaks = new ArrayList<>();
        for(int i = 1; i < N-1; i++) {
            if(A[i] > A[i-1] && A[i] > A[i+1]) peaks.add(i);
        }
        if(peaks.size() <=1) return peaks.size();

        for(int size = 1; size <= N; size++){
            if(N % size != 0) continue; // skip if non-divisible
            int find = 0;
            int groups = N/size;
            boolean ok = true;
            // Find whether every group has a peak
            for(int peakIdx : peaks){
                if(peakIdx/size > find){
                    ok = false;
                    break;
                }
                if(peakIdx/size == find) find++;
            }
            if(find != groups) ok = false;
            if(ok) return groups;
        }
        return 0;
    }
}
