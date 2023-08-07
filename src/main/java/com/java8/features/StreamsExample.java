package com.java8.features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) myList.add(i);
        // sequential stream
        Stream<Integer> sequentialStream = myList.stream();
        // parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);

        highNums.forEach( p -> System.out.println("High Nums parallel ="+p));

        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
        System.out.println(" Sum of items iterator:"+sumIterator(myList));
        System.out.println(" Sum of items stream:"+sumStream(myList));

        IntStream range = IntStream.range(1,100);
        System.out.println("Total calculated with range:"+range.filter( num -> num > 10).sum());
        range = IntStream.range(1,100);
        System.out.println("Max calculated with range:"+range.filter( num -> num > 10).max());

        range = IntStream.range(1,100);
        System.out.println("Min calculated with range:"+range.filter( num -> num > 10).min());
        range = IntStream.range(1,100);
        System.out.println("Count calculated with range:"+range.filter( num -> num > 10).count());
        range = IntStream.range(1,100);
        System.out.println("Sum calculated with reduce and range:"+range.reduce(0,Integer::sum));
        range = IntStream.range(1,100);
        System.out.println("Max calculated with reduce and range:"+range.reduce(0,Integer::max));
        range = IntStream.range(1,100);
        System.out.println("Min calculated with reduce and range:"+range.reduce(0,Integer::min));

    }

    private static int sumIterator(List<Integer> list){
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while(it.hasNext()){
            int num = it.next();
            if( num > 10 ){
                sum += num;
            }
        }
        return sum;
    }

    private static int sumStream(List<Integer> list){
        return list.parallelStream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }
}
