package com.odfsoft.lessons.lesson7.brackets;

import java.util.Stack;

public class Brackets {

    public int solution(String S) {
        Stack<Character> openOperations = new Stack<>();
        char[] characters = S.toCharArray();
        for(int i=0; i < S.length();i++) {
            if(characters[i] == '{' || characters[i] == '(' || characters[i] == '[') {
                openOperations.add(characters[i]);
            } else {
                if(!openOperations.isEmpty()) {
                    if ((characters[i] == '}' && openOperations.peek() == '{') ||
                            (characters[i] == ')' && openOperations.peek() == '(') ||
                            (characters[i] == ']' && openOperations.peek() == '[')
                    ) {
                        openOperations.pop();
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            }
        }
        return openOperations.isEmpty() ? 1 : 0;
    }
}
