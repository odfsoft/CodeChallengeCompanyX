package com.odfsoft.lessons.lesson4.perm_check;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public int solution(int[] A) {
        Set<Integer> permutationNumbers = new HashSet<>();
        for(int i=1; i <= A.length; i++) {
            permutationNumbers.add(i);
        }
        for (int number: A) {
            if(permutationNumbers.contains(number)) {
                permutationNumbers.remove(number);
            } else {
                return 0;
            }
        }
        return permutationNumbers.isEmpty() ? 1 : 0;
    }

}
