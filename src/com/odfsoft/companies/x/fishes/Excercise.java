package com.odfsoft.companies.x.fishes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Excercise {

    // ABAD = ABA = 3
    // ACCCCD = -> ACCCC -> A = 1
    // CAAADACD -> CAAADAC -> AAADA -> 5
    // DDDDDACD -> DDDDDAC -> DDDDDA -> 6
    // CAAADACD -> CAAADAC -> AAADA -> 5
    // CCAAA -> AAA = 3
    public int solution(String S) {
        char[] fishes = S.toCharArray();
        char[] eatableSpecies = new char[] {'D', 'C', 'B'};
        List<Character> survivors = new ArrayList<>();
        for(Character ch: fishes) {
            survivors.add(ch);
        }

        for(char eatableFish: eatableSpecies) {
            survivors = eatAllOfSpecies(survivors, eatableFish);
        }

        return survivors.size();
    }

    private List<Character> eatAllOfSpecies(List<Character> survivors, Character eatableSpecies) {
        int prev = -1;
        int next = 1;
        int current = 0;
        Set<Integer> eatenFishes = new HashSet<>();
        while(current < survivors.size()) {
            Character targetFish = survivors.get(current);
            // we care about the eatableSpecies only.
            if(eatableSpecies.compareTo(targetFish) == 0) {
                // can the prev eat the target
                if(prev != -1 && eats(survivors.get(prev), targetFish)) {
                    eatenFishes.add(current);
                    current = next;
                    next++;
                } else if(next < survivors.size() && eats(survivors.get(next), targetFish)) {
                    // can the next eat the target
                    eatenFishes.add(current);
                    // we cant eat more to the left
                    if(prev != -1) {
                        current = prev;
                        prev--;
                    } else {
                        current = next;
                        next++;
                    }
                } else {
                    prev = current;
                    current = next;
                    next++;
                }
            } else {
                prev = current;
                current = next;
                next++;
            }
        }

        List<Character> newSurvivors = new ArrayList<>();
        for(int i = 0; i < survivors.size(); i++){
            if(!eatenFishes.contains(i)) {
                newSurvivors.add(survivors.get(i));
            }
        }
        return newSurvivors;
    }

    private boolean eats(char a, char b) {
        if(a == 'A' && b == 'D') {
            return false;
        } else {
            return a < b;
        }
    }
}
