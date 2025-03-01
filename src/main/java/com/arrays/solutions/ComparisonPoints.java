package com.arrays.solutions;

import java.util.List;

public class ComparisonPoints {

  public List<Integer> compareTwoArrays(List<Integer> a, List<Integer> b) {
    int aliceScore = 0;
    int bobScore = 0;
    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        aliceScore++;
      } else if (a.get(i) < b.get(i)) {
        bobScore++;
      }
    }
    return List.of(aliceScore, bobScore);
  }
}
