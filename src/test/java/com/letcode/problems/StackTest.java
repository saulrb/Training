package com.letcode.problems;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack(4);
    }

    @Test
    void testPrintStack() {
        stack.printStack();
        // You can manually check the output in the console
    }
    @Test
    void testGetTop() {
        stack.getTop();
        // You can manually check the output in the console
    }
    @Test
    void testGetHeight() {
        stack.getHeight();
        // You can manually check the output in the console
    }
    @Test
    void testPush(){
        stack.push(2);
        stack.printStack();
        assertEquals(2, stack.height);
    }
}