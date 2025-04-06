package com.letcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesTest {
    BalancedParentheses balancedParentheses;
    @BeforeEach
    void setUp() {
        balancedParentheses = new BalancedParentheses();
    }

    @Test
    void testBalancedParentheses(){
        assertTrue(balancedParentheses.isBalancedParentheses("()"));
    }

    @Test
    void testUnBalancedParentheses(){
        assertFalse(balancedParentheses.isBalancedParentheses("())"));
    }

    @Test
    void testUnBalancedParentheses2(){
        assertFalse(balancedParentheses.isBalancedParentheses("("));
    }
}