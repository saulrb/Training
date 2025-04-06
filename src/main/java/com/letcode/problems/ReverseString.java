package com.letcode.problems;

import java.util.Stack;

public class ReverseString {
    Stack<Character> stack = new Stack();

    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
