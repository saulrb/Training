package com.infosys.questions;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static SortedSet<String> getAllCOuntriesLoaded(SortedSet<String> ts){
        if ( ts != null ) {
            ts.add("India");
            ts.add("Australia");
            ts.add("South Africa");
            ts.add("India");
        }
        return ts;
    }

    public static SortedSet<String> removeElement(SortedSet<String> ts,String element) {
        ts.remove(element);
        return ts;
    }
}
