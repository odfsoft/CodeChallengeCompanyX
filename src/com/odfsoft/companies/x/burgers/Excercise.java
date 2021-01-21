package com.odfsoft.companies.x.burgers;

public class Excercise {

    // ABAD = 3
    // cheese =  big + mini
    // mini = cheese -  big
    // tomato =  4 * big + 2 * mini
    // tomato = 4 * big + 2 * (cheese - big)
    // tomato = 2 * big + 2 * cheese
    // big = (tomato - 2 * cheese) / 2
    public int[] solution(int X, int Y) {
        int big = (Y - 2 * X)/ 2;
        int mini = X - big;
        int remainingCheese = X - (big + mini);
        int remainingTomato = Y - (4 * big + 2 * mini);
        if(remainingCheese != 0 || remainingTomato != 0) {
            return new int[] { -1, -1 };
        } else {
            return new int[] { mini, big };
        }
    }

}
