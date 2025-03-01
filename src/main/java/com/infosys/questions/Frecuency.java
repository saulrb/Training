package com.infosys.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frecuency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,5,7,9,10);
        list.stream().forEach( s -> {
            System.out.println("Occurence of element:"+s+ "is"+ Collections.frequency(list,s));
        });
    }
}
