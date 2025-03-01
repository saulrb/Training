package com.letcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTowTest {
    List<Integer> input ;
    int target;
    @BeforeEach
    public void setUp(){
        input = Arrays.asList(3,2,4,5,7,9);
    }

    @Test
    void towSum() {
        target = 7;
        int[] solution = SumOfTow.towSum(input,target);
        Assertions.assertEquals(target,(input.get(solution[0]).intValue() + input.get(solution[1]).intValue()));
    }

    @Test
    void highestSum() {
        target = 16;
        int[] solution = SumOfTow.highestSum(input);
        Assertions.assertEquals(target,input.get(solution[0]).intValue() + input.get(solution[1]).intValue());

    }
}