package com.letcode.problems;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    private static int firstUniqChar(String s) {
        Map<String,Integer> frequences = new HashMap<>();
        Map<String,Integer> positions = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            String letter = s.substring(i,i+1);
            if (frequences.containsKey(letter)){
                frequences.put(letter,frequences.get(letter).intValue()+1);
            }else {
                frequences.put(letter,1);
                positions.put(letter,i);
            }
        }
        for(Map.Entry<String,Integer> item: frequences.entrySet()){

        }
        int position = 0;
        for(int i = 0; i < s.length(); i++){
            if( frequences.get(s.substring(i,i+1)).intValue() == 1){
                position = i;
                break;
            }
        }
        return position;
    }
    public static void main(String[] args) {
        System.out.print(firstUniqChar("leetcode"));
    }
}
