package com.letcode.problems;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb4 = new StringBuilder();
        int j = 0;
        Map<String,Integer> subSize = new HashMap<>();
        for(int delta = 0; delta <= s.length(); delta++ ){
            for(int i = 0 ; i < s.length(); i++){
                j = i ;
                while  ( j < i + delta  && j < s.length()) {
                    sb4.append(arr[j]);
                    j++;
                }
                System.out.println("greedy: "+sb4.toString());
                if(isPalindrome(sb4.toString())) {
                    subSize.put(sb4.toString(),sb4.toString().length());
                }
                sb4 = new StringBuilder();
            }
        }
        int max = 0;
        String longest = null;
        for(Map.Entry<String,Integer> entry: subSize.entrySet()) {
            if (max < entry.getValue().intValue()) {
                max = entry.getValue();
                longest = entry.getKey();
            }
        }
        return longest;
    }


    public String longestPalindrome2(String s) {
        int maxLen = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            int curLen = Math.max(getLen(s, i, i), getLen(s, i, i+1));
            if(curLen > maxLen){
                maxLen = curLen;
                start = i - (curLen - 1)/2;
            }
        }
        return s.substring(start, start + maxLen);
    }
    private static int getLen(String s, int l, int r){
        while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }

    public boolean isPalindrome(String input){
        if(input.length() == 0 || input.length() == 1) {
            return true;
        }
        if(input.charAt(0) == input.charAt(input.length() -1)) {
            return isPalindrome(input.substring(1,input.length() -1));
        }
        return  false;
    }
}