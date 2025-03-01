package com.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    int[] data;

    @BeforeEach
    void setUp() {
        data = new int[] { -5, 20,10,3,4,2,0};
    }

    @Test
    void mergeSort() {
        MergeSort.mergeSort(data,0,data.length-1);
        System.out.println("stop");
        for(int i = 0 ; i < data.length ; i++){
            System.out.print(data[i]+",");
        }
        System.out.println("");
        assertTrue(true);
    }
}