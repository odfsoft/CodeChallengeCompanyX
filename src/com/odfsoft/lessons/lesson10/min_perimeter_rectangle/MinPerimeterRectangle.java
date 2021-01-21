package com.odfsoft.lessons.lesson10.min_perimeter_rectangle;

public class MinPerimeterRectangle {

    public int solution(int N) {
        int max = (int)Math.ceil(Math.sqrt(N));
        int min = Integer.MAX_VALUE;
        for(int a = 1; a <= max; a++) {
            if(N%a == 0) {
                int b = N / a;
                int perimeter = 2 * (a + b);
                min = Math.min(min, perimeter);
            }
        }

        return min;
    }
}
