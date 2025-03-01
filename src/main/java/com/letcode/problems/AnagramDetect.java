package com.letcode.problems;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class AnagramDetect {


    public static boolean isAnagram(List<List<String>> wordList){
        final AtomicBoolean[] isAnagram = {new AtomicBoolean(true)};
        wordList.stream().forEach( pairs -> {
            if (pairs.get(0).length() != pairs.get(1).length()){
                isAnagram[0].set(false);
            } else {
                char[] word1 = new char[pairs.get(0).length()];
                char[] word2 = new char[pairs.get(1).length()];
                for ( int i = 0 ; i < word1.length; i++){
                    word1[i] = pairs.get(0).charAt(i);
                    word2[i] = pairs.get(1).charAt(i);
                }
                Arrays.sort(word1);
                Arrays.sort(word2);
                for(int i = 0 ; i < word1.length ; i++){
                    if ( word1[i] != word2[i]) {
                        isAnagram[0].set(false);
                    }
                }
            }
        });
        return isAnagram[0].get();
    }


    public static boolean isAnagram2(List<List<String>> wordList){
        final AtomicBoolean[] isAnagram = {new AtomicBoolean(true)};
        wordList.stream().forEach( pairs -> {
            if (pairs.get(0).length() != pairs.get(1).length()){
                isAnagram[0].set(false);
            } else {
                SortedMap<Character, Integer> words1 = new TreeMap<>();
                SortedMap<Character, Integer> words2 = new TreeMap<>();
                for ( int i = 0 ; i < pairs.get(0).length(); i++){
                    if(words1.containsKey(pairs.get(0).charAt(i))) {
                        Integer val = words1.get(pairs.get(0).charAt(i));
                        words1.put(pairs.get(0).charAt(i), val + 1);
                    } else {
                        words1.put(pairs.get(0).charAt(i),1);
                    }
                    if(words2.containsKey(pairs.get(1).charAt(i))) {
                        Integer val = words2.get(pairs.get(1).charAt(i));
                        words2.put(pairs.get(1).charAt(i), val + 1);
                    } else {
                        words2.put(pairs.get(1).charAt(i),1);
                    }
                }
                Set<Map.Entry<Character, Integer>> entries = words1.entrySet();
                entries.forEach( entry -> {
                    if ( words2.get(entry.getKey()).intValue() != entry.getValue() ){
                        isAnagram[0].set(false);
                    }
                });
            }
        });
        return isAnagram[0].get();
    }

}
