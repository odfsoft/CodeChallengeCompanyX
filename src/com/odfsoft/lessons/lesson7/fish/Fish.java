package com.odfsoft.lessons.lesson7.fish;

import java.util.Stack;

public class Fish {
    public int solution(int[] A, int[] B) {
        Stack<Integer> upstreamFish = new Stack<>();
        int survivors = 0;
        for(int i=0;i<A.length; i++) {
            if(B[i] == 1) {
                upstreamFish.push(A[i]);
            } else {
                if(upstreamFish.isEmpty()) {
                    survivors++;
                } else {

                    if(A[i] == upstreamFish.peek()) {
                        upstreamFish.push(A[i]);
                    } else {
                        while(!upstreamFish.isEmpty() && A[i] > upstreamFish.peek()) {
                            upstreamFish.pop();
                        }
                        if(upstreamFish.isEmpty()) {
                            survivors++;
                        }
                    }
                }
            }
        }

        return survivors + upstreamFish.size();
    }

}
