package com.odfsoft.longest_consecutive;

public class Excercise {

    public int solution(int[] numbers) {
        int order = 0;
        int longest = 1;
        int currentLongest = 1;
        for (int i = 1; i < numbers.length; i++) {
            int difference = numbers[i] - numbers[i - 1];
            if(Math.abs(difference) == 1 && (order == difference || order == 0) ) {
                order = numbers[i] - numbers[i -1];
                currentLongest++;
            } else {
                order = 0;
                currentLongest = 1;
            }

            if(currentLongest > longest) {
                longest = currentLongest;
            }
        }
        return longest;
    }

}
