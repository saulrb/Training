package com.letcode.problems;

import java.util.Stack;

public class BalancedParentheses {
    Stack<Character> stack = new Stack<>();
    static final char openParentheses = '(', closeParentheses = ')';
    public boolean isBalancedParentheses(String input){
        if (input == null) {
            return false;
        }
        for(int i =0 ; i < input.length() ; i++){
            switch ( input.charAt(i)){
                case openParentheses ->  {
                    stack.push(input.charAt(i));
                }
                case closeParentheses -> {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char top = stack.pop();
                    if (top != openParentheses) {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
