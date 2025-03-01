package com.arrays.solutions;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatrixAbsoluteDifferenceTest {

  MatrixAbsoluteDifference subject;
  @BeforeEach
  void setUp() {
    subject = new MatrixAbsoluteDifference();
  }

  @Test void test() {
    List<List<Integer>> arr = asList(asList(1,2,3),asList(4,5,6),asList(9,8,9));
    int result = subject.diagonalDifference(arr);
    assertEquals(2, result);
  }

  @Test void ratios() {
    List<Integer> arr = asList(-4,3,-9,0,4,1);
    var result = subject.calculateRatios(arr);
    assertEquals(List.of(0.5f, 0.33333334f, 0.16666667f), result);
  }
}
