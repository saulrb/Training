package com.arrays.solutions;

import java.util.List;

public class SumOfArray {

  public Object sumOfList(List<Integer> list) {
    return list.stream().reduce(0, (a, b) -> a+b);
  }
  public Object sumOfLongList(List<Long> list) {
    return list.stream().reduce(0L, (a, b) -> a+b);
  }

}
