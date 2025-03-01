package com.arrays.solutions;

public class SimpleSumOfArrays {

  public int[] sumOfArrays(int[] a, int[] b) {
    int[] result = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      result[i] = a[i] + b[i];
    }
    return result;
  }
}
