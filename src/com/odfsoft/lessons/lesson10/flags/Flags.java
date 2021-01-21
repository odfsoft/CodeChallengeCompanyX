package com.odfsoft.lessons.lesson10.flags;

import java.util.ArrayList;
import java.util.List;

public class Flags {

    // This solution does not generates 100% but only 86%
    // The other solutions use more a mathematical approach which a bit harder to reason about.
    //
    public int solution(int[] A) {
        List<Integer> peakList = new ArrayList<>();

        for (int i=1; i<A.length-1; i++) {
            if (A[i] > A[i-1] && A[i] > A[i+1]) {
                peakList.add(i);
                i++;
            }
        }

        int maxFlagCount = 0;
        int start = 0;
        int end = peakList.size();

        if (end < 2) {
            return end;
        }

        while (start <= end) {
            // perform binary search on the existing peaks
            int flags = (start + end) / 2;
            int count = 1;
            int prevIndex = peakList.get(0);
            System.out.println("----- " + flags);
            // Validate if we can take this number of flags
            for (int j=1; j<peakList.size() && count<flags; j++) {
                // validate flag distance
                int distance = peakList.get(j) - prevIndex;
                System.out.print(distance + " ");
                if (distance >= flags) {
                    count++;
                    prevIndex = peakList.get(j);
                }
            }

            System.out.println();
            System.out.println("----- " + count);

            // if we can take this number of flags we move to the right side
            if (count == flags) {
                start = flags + 1;
                maxFlagCount = count;
            } else {
                // if we could not take this many flags we move to the left side
                end = flags - 1;
            }
        }

        return maxFlagCount;
    }

}
