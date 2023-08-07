package com.hackerrank.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    String balanced = "[][][][]";
    String unbalanced = "[][][][]{";

    @Test
    void isBalancedTest() {
        Assertions.assertEquals("YES",BalancedBrackets.isBalanced(balanced));
    }
    @Test
    void isUnBalancedTest() {
        Assertions.assertEquals("NO",BalancedBrackets.isBalanced(unbalanced));
    }

}