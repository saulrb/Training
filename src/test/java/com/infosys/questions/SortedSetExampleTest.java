package com.infosys.questions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;



class SortedSetExampleTest {

    SortedSet<String> stringSortedSet;
    SortedSet<String> stringSortedSet2;
    @BeforeEach
    void setUp() {
        stringSortedSet = new TreeSet<>();
    }

    @Test
    void getAllCOuntriesLoaded(){
        SortedSetExample.getAllCOuntriesLoaded(stringSortedSet);
        assertEquals(3,stringSortedSet.size());
    }
    @Test
    void  removeElement() {
        SortedSetExample.getAllCOuntriesLoaded(stringSortedSet);
        SortedSetExample.removeElement(stringSortedSet, "India");
        assertEquals(2,stringSortedSet.size());
    }
    @Test
    void verifyElements() {
        SortedSetExample.getAllCOuntriesLoaded(stringSortedSet);
        stringSortedSet2 = new TreeSet<>();
        stringSortedSet2.add("India");
        stringSortedSet2.add("Australia");
        stringSortedSet2.add("South Africa");
        Supplier<String> messageSupplier =  () -> "Both List Matches ok";
        Assertions.assertLinesMatch(stringSortedSet.stream().sorted(),stringSortedSet.stream().sorted(),messageSupplier);
    }
}