package com.letcode.problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectTest {

    List<List<String>> wordsList;

    @BeforeEach
    void setUp() {
        wordsList = Arrays.asList(Arrays.asList("LISTEN","SILENT")
                                 ,Arrays.asList("TRIANGLE","INTEGRAL")
                                ,Arrays.asList("ABBA","BABA"));
    }

    @Test
    void isAnagram() {
        Assertions.assertTrue(AnagramDetect.isAnagram(wordsList));
    }

    @Test
    void isAnagram2() {
        Assertions.assertTrue(AnagramDetect.isAnagram2(wordsList));
    }
}