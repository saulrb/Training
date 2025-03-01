package com.arrays.solutions;

import java.util.List;

public class MatrixAbsoluteDifference {

  public int diagonalDifference(List<List<Integer>> arr) {
    int leftDiagonal = 0;
    int rightDiagonal = 0;
    int size = arr.size();
    for (int i = 0; i < size; i++) {
      leftDiagonal += arr.get(i).get(i);
      rightDiagonal += arr.get(i).get(size - i - 1);
    }
    return Math.abs(leftDiagonal - rightDiagonal);
  }

  public List<Float> calculateRatios(List<Integer> arr) {
    var total = arr.size();
    float positive = (float) arr.stream().filter( x -> x > 0).count() / total;
    float negative = (float) arr.stream().filter( x -> x < 0).count() / total;
    float zero = (float) arr.stream().filter( x -> x == 0).count() / total;
    return List.of(positive, negative, zero);
  }
}
