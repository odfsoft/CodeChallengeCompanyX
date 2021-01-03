package com.odfsoft.lessons.lesson5.passing_cars;

public class PassingCars {

    /**
     * tricky one with the return clause if the exit condition is not inside the loop the
     * totalCars integer will overload and not exist with -1
     */
    public int solution(int[] A) {
        int countEastCars = 0;
        int totalCars = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] == 0) {
                countEastCars++;
            } else {
                totalCars += countEastCars;
                if(totalCars > 1_000_000_000) {
                    return -1;
                }
            }
        }
        return totalCars;
    }
}
