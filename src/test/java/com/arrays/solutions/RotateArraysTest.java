package com.arrays.solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RotateArraysTest {
    int[] nums = { 1,2,3,4,5,6,7};
    int[] result = {5,6,7,1,2,3,4};
    RotateArrays subject;
    @BeforeEach
    void setUp() {
        subject = new RotateArrays();
    }

    @Test
    @Order(1)
    public void rotetArray_positions(){
        int k = 3;
        subject.rotate(nums,k);
        Assertions.assertArrayEquals(nums,result);
    }

    @Test
    @Order(2)
    public void bubble_RotetArray_positions(){
        int k = 3;
        subject.bubbleRotate(nums,k);
        Assertions.assertArrayEquals(nums,result);
    }
    @Test
    @Order(3)
    public void reversal_RotetArray_positions(){
        int k = 3;
        subject.reversalRotate(nums,k);
        Assertions.assertArrayEquals(nums,result);
    }

}