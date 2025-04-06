package com.letcode.problems;

import java.util.Stack;

public class SortWithStack {
    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            tempStack.push(current);
        }
        while(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
