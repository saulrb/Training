package com.hackerrank.problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TowerBreakersTest {

  TowerBreakers subject;
  @BeforeEach
  void setUp() {
    subject = new TowerBreakers();
    }

  @Test
  void towerBreakers() {
    assertEquals(2, subject.towerBreakers(2,2));
    assertEquals(1, subject.towerBreakers(1,4));
    assertEquals(2, subject.towerBreakers(10001, 1));
  }
}