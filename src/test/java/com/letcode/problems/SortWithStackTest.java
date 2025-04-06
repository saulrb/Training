package com.letcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Stack;

class SortWithStackTest {

    SortWithStack sortWithStack;

    @BeforeEach
    void setUp() {
        sortWithStack = new SortWithStack();
    }

    @Test
    void testSortStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortWithStack.sortStack(stack);

        assertEquals(1, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(4, stack.pop());
    }
}