package com.arrays.solutions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumOfArrayTest {

  SumOfArray subject;
  @BeforeEach
  void setUp() {
    subject = new SumOfArray();
  }
  @Test void sumOfList() {
      var list = List.of(1,2,3,4,5,6,7,8,9,10);
      var expected = 55;
      var actual = subject.sumOfList(list);
      assertEquals(expected, actual);
  }

  @Test void sumOfLongNumers(){
    var list = List.of(1000000001L,1000000002L,1000000003L,1000000004L,1000000005L);
    var expected = 5000000015L;
    var actual = subject.sumOfLongList(list);
    assertEquals(expected, actual);
  }

}
