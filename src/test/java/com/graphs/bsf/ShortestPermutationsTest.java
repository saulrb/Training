package com.graphs.bsf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPermutationsTest {

    ShortestPermutations subject;

    @BeforeEach
    void setUp() {
        List<String> listOfWords = List.of("hit","git","got","mot","mog","dog");
        subject = new ShortestPermutations("hat","dog", listOfWords );
        //subject = new ShortestPermutations();
    }
    @Test
    void testShortest(){
       var transformations = subject.transformations();
        System.out.println("Transformations:"+transformations);
       assertTrue(transformations == 6);
    }
    @Test
    void test_no_Solution(){
        List<String> listOfWords = List.of("hit","git","got","mot","mog");
        subject = new ShortestPermutations("hat","dog", listOfWords );
       // subject = new ShortestPermutations();
        var transformations = subject.transformations();
        System.out.println(subject.transformation(6*3,2));
        assertTrue(transformations == 0);
    }
}