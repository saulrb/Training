package com.infosys.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortArrayStringsBySize {

    private static List<String> items = Arrays.asList("hello","java","int","double","collection");

    public static void main(String[] args) {
        items.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
