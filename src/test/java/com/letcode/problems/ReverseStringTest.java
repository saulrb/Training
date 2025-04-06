package com.letcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    ReverseString reverseString;
    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    void testReverseString() {
        String input = "hello";
        String expected = "olleh";
        String actual = reverseString.reverseString(input);
        assertEquals(expected, actual);
    }
}