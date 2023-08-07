package com.letcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciSequenceTest {

    int times;

    @BeforeEach
    void setUp() {
        times = 14;
    }

    @Test
    void getSequence() {
        double target = 610;
        Assertions.assertEquals(target,FibonacciSequence.getSequence(times));
    }

    @Test
    void getSequenceLineal() {
        double target = 610;
        Assertions.assertEquals(target,FibonacciSequence.getSequenceLineal(times));
    }

    @Test
    void getSequence2() {
        long element = 15 ;
        double target = 610;
        Assertions.assertEquals(target,FibonacciSequence.fib(element));
    }
}