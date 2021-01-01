package com.odfsoft.lessons.lesson3.frog_jump;

public class FrogJump {

    /*
     X = 10, Y = 85, D=30
     Y (85) <= X (10) + (D (30) * R)
     R = roundUp((Y - X)/D)
     R = ((Y - X)  + D - 1)/ D
     */

    public int solution(int X, int Y, int D) {
        return ((Y - X)  + D - 1)/ D;
    }

}
