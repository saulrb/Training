package com.arrays.solutions;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComparisonPointsTest {

  ComparisonPoints subject;

  @BeforeEach
  void setUp() {
    subject = new ComparisonPoints();
  }

  @Test
  void compareTwoArrays(){
    var a = asList(5, 6, 7);
    var b = asList(3, 6, 10);
    var result = subject.compareTwoArrays(a, b);
    assertEquals(1, result.get(0));
    assertEquals(1, result.get(1));
  }
}
