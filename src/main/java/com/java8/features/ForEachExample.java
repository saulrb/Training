package com.java8.features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

    static Consumer<Integer> myConsumer = ( val  -> {
        System.out.println("Consumer imp value::"+val);
    });

    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        for(int i=0; i < 10; i++) mylist.add(i);
        Iterator<Integer> it = mylist.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator value::"+i);
        }
        // Traversig through forEach method of Iterable with anonymouse class
        mylist.forEach( val -> {
            System.out.println("ForEach anonymous class value::"+val);
        });
        mylist.forEach(myConsumer);
        mylist.forEach(System.out::println);
    }

}
