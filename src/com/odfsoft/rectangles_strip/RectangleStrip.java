package com.odfsoft.rectangles_strip;

import java.util.HashMap;
import java.util.Map;

public class RectangleStrip {

    public int solution(int[] s1, int[] s2) {
        Map<Integer, Integer> found = new HashMap<>();
        int max = 1;
        for(int i=0; i<s1.length; i++) {
            Integer appearances = found.getOrDefault(s1[i], 0) + 1;
            found.put(s1[i], appearances);
            max = Math.max(max, appearances);
            if(s1[i] != s2[i]) {
                Integer appearancesS2 = found.getOrDefault(s2[i], 0) + 1;
                found.put(s2[i], appearancesS2);
                max = Math.max(max, appearances);
            }
        }
        return max;
    }
}
