package com.odfsoft.lessons.lesson1.binary_gap;

public class BinaryGap {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int longest = 0;
        int currentLongest = 0;
        int lastOne = -1;
        char[] binaryChars = binary.toCharArray();
        for (int i = 0; i < binaryChars.length; i++) {
            if(binaryChars[i] == '1') {
               if(lastOne != -1) {
                   currentLongest = (i - lastOne) - 1;
                   if(currentLongest > longest) {
                       longest = currentLongest;
                   }
               }
                lastOne = i;
            }
        }
        return longest;
    }


}
