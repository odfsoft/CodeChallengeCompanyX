package com.odfsoft.fishes;

public class Excercise {

    // ABAD = 3
    // ACCD = 1
    public int solution(String S) {
        char[] fishes = S.toCharArray();
        char[] speciesWhoEatOthers = new char[] {'C', 'B', 'A'};
        int survivals = fishes.length;
        for(char specieWhoEatOther: speciesWhoEatOthers) {
            for(int i = 0; i < fishes.length - 1; i ++) {
                if(fishes[i] == specieWhoEatOther) {
                    int j = i + 1;
                    while (j < fishes.length && eats(specieWhoEatOther, fishes[j])) {
                        survivals--;
                        j++;
                    }
                }
            }
        }

        return survivals;
    }

    private boolean eats(char a, char b) {
        if(a == 'A' && b == 'D') {
            return false;
        } else {
            return a < b;
        }
    }
}
