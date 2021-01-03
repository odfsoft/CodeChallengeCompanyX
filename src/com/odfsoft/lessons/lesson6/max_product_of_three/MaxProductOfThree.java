package com.odfsoft.lessons.lesson6.max_product_of_three;

import static java.lang.Integer.*;
import static java.lang.Integer.MIN_VALUE;

public class MaxProductOfThree {

    public int solution(int[] A) {
        int firstMin = MAX_VALUE, secondMin = MAX_VALUE;
        int firstMax = MIN_VALUE, secondMax = MIN_VALUE, thirdMax = MIN_VALUE;

        for(int i=0;i<A.length;i++) {
            if(A[i] < firstMin) {
                secondMin = firstMin;
                firstMin = A[i];
            } else if(A[i] < secondMin) {
                secondMin = A[i];
            }

            if(A[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = A[i];
            } else if(A[i] > secondMax){
                thirdMax = secondMax;
                secondMax = A[i];
            } else if(A[i] > thirdMax) {
                thirdMax = A[i];
            }
        }

        return Math.max(firstMin * secondMin * firstMax, firstMax * secondMax * thirdMax);
    }

}
