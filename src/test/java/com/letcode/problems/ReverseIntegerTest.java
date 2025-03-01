package com.letcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
/*
    Given a signed 32-bit integer x, return x with its digits reversed.
    If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 */
    @BeforeEach
    void setUp() {
    }

    /* Test 1
    Input: x = 123
    Output: 321
     */
    @Test
    void reverse() {
        assertEquals(321, ReverseInteger.reverse(123));
    }
    /*
    Test 2:
    Input: x = -123
    Output: -321
    */
    @Test
    void reverse2() {
        assertEquals(-321, ReverseInteger.reverse(-123));
    }
    /*
    Test 3:
    Input: x = 120
    Output: 21
     */

    @Test
    void reverse3(){
        assertEquals(21, ReverseInteger.reverse(120));
    }

        /*
    Test 3:
    Input: x = 1534236469
    Output: 9646324351
    1056389759
     */
    @Test
    void reverse4(){
        assertEquals(0, ReverseInteger.reverse(1534236469));
    }

}