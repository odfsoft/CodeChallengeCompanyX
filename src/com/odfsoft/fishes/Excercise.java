package com.odfsoft.fishes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Excercise {

    // ABAD = 3 -> 0 eats 1, 2 eats 1 = 1
    // ACCCCD = 1 -> ACCC -> A = 1
    // CAAADACD -> CAAADAC -> AAADA -> 5
    // DDDDDACD -> CAABBAC -> AABBA -> AAA = 3
    // CCAAA -> AAA
    public int solution(String S) {
        char[] fishes = S.toCharArray();
        char[] eatableFishes = new char[] {'D', 'C', 'B'};
        List<Character> survivors = new ArrayList<>();
        for(Character ch: fishes) {
            survivors.add(ch);
        }

        for(char eatableFish: eatableFishes) {
            survivors = eatAllFishes(survivors, eatableFish);
        }

        return survivors.size();
    }

    private List<Character> eatAllFishes(List<Character> survivors, Character eatableFish) {
        int prev = -1;
        int next = 1;
        int current = 0;
        HashSet<Integer> eatenFishes = new HashSet<>();
        while(current < survivors.size()) {
            Character targetFish = survivors.get(current);
            if(eatableFish.compareTo(targetFish) == 0) {
                if(prev != -1 && eats(survivors.get(prev), targetFish)) {
                    eatenFishes.add(current);
                    current = next;
                    next++;
                } else {
                    if(next < survivors.size() && eats(survivors.get(next), targetFish)) {
                        eatenFishes.add(current);
                        if(prev != -1) {
                            current = prev;
                            prev--;
                        } else {
                            current = next;
                            next++;
                        }
                    } else {
                        System.out.println("survivor=" + current + " value = " + survivors.get(current));
                        prev = current;
                        current = next;
                        next++;
                    }
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
        System.out.println(newSurvivors);
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
