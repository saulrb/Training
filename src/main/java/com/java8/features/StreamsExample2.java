package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsExample2 {

    public static void main(String[] args) {
        // Creating streams
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        stream.forEach(System.out::println);

        Stream<Integer> stream1 = Stream.of(new Integer[]{1,2,3,4,5,6});
        stream1.forEach(System.out::println);

        // ParallelStream and Stream
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i < 100; i++) myList.add(i);

        Stream<Integer> sequencialStream = myList.stream();
        Stream<Integer> parallelStream = myList.parallelStream();
        sequencialStream.forEach(System.out::println);
        parallelStream.forEach(System.out::println);


    }
}
