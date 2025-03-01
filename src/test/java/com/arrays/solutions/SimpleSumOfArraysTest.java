package com.arrays.solutions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleSumOfArraysTest {

  SimpleSumOfArrays subject;
  @BeforeEach
  void setUp() {
    subject = new SimpleSumOfArrays();
  }

  @Test
  void testSumOfArrays() {
    int[] a = {1, 2, 3};
    int[] b = {1, 2, 3};
    int[] expected = {2, 4, 6};
    int[] actual = subject.sumOfArrays(a, b);
    assertArrayEquals(expected, actual);
  }
}
