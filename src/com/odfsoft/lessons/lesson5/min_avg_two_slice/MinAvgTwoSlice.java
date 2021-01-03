package com.odfsoft.lessons.lesson5.min_avg_two_slice;

public class MinAvgTwoSlice {


    /*  the global avg should be conform by a slice of 2 or 3 elements
        slices bigger than 2 or 3 should contain the sub-slices of 2 or 3
        e.g. [1,2,3,4] -> 1,2 = 1.5, 2,3= 2.5, 3,4=3.5. in this case 1.5 is the min
        1,2 is contain into 1,2,3 and 1,2,3,4 but those will always have bigger or eq avg.
        1,2,3 = 2, 1,2,3,4 = 2.5
        full explanation can be found here: http://codility-lessons.blogspot.com/2014/07/lesson-3-minavgtwoslice.html
     */
    public int solution(int[] A) {
        double minAvg = (A[0] + A[1]) / 2.0;
        int idx = 0;

        for (int i = 2; i < A.length; i++){
            double avgWith2 = (A[i - 1] + A[i]) / 2.0;
            double avgWith3 = (A[i - 2] + A[i - 1] + A[i]) / 3.0;

            if (avgWith2 < minAvg){
                idx = i - 1;
                minAvg = avgWith2;
            }
            if (avgWith3 < minAvg){
                idx = i - 2;
                minAvg = avgWith3;
            }
        }
        return idx;
    }
}
