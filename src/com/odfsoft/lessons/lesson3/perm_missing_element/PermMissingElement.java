package com.odfsoft.lessons.lesson3.perm_missing_element;

public class PermMissingElement {

    public int solution(int[] A) {
        boolean[] result = new boolean[A.length + 1];
        for(int i=0; i<A.length; i++){
            result[A[i] - 1] = true;
        }
        for(int i=0; i<result.length; i++) {
            if(result[i] == false) {
                return i + 1;
            }
        }
        return -1;
    }
}
