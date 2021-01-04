package com.odfsoft.lessons.lesson7.stone_wall;

import java.util.Stack;

public class StoneWall {

    public int solution(int[] H) {
        Stack<Integer> highs = new Stack<>();
        int blocks = 0;
        for(int i=0; i<H.length;i++) {
            while(!highs.isEmpty() && H[i] <= highs.peek()) {
                if(H[i] < highs.peek()) {
                    blocks++;
                }
                highs.pop();
            }
            highs.push(H[i]);
        }

        return blocks + highs.size();
    }
}
