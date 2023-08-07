package com.java8.features;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    int[] numbers ;

    Sample sample;

    @BeforeEach
    void setUp() {
        numbers = new int[] { 2,16,34,55,77,90,29 };
        sample = new Sample();
    }

    @Test
    void getNumber() {
        List<Integer> result = sample.getNumber(numbers,18);
        result.forEach(System.out::println);
        assertTrue(!result.isEmpty());
    }
    @Test
    void getOneNumber() {
        List<Integer> result = sample.getNumber(numbers,16);
        result.forEach(System.out::println);
        assertTrue(result.size() == 1);
    }

    @Test
    void getNumberNoValue() {
        List<Integer> result = sample.getNumber(numbers,44);
        assertTrue(result.isEmpty());
    }
}