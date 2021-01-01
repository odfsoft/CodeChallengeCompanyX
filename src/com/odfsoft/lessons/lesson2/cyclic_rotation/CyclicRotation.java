package com.odfsoft.lessons.lesson2.cyclic_rotation;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        int length = A.length;
        int[] result = new int[length];
        for(int i = 0; i< length; i++) {
            result[(i + K) % length] = A[i];
        }
        return result;
    }
}
