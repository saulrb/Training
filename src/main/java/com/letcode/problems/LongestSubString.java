package com.letcode.problems;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {

    public static int lengthOfLongestSubstring(String s) {
        List<String> subsL = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for( int i=0; i < s.length() ; i++){
            j = i;
            sb.append(s.charAt(i));
            while( j < s.length()){
                j++;
                if ( j < s.length() && sb.toString().indexOf(s.charAt(j)) == -1){
                    sb.append(s.charAt(j));
                } else {
                    subsL.add(sb.toString());
                    sb = new StringBuilder();
                    break;
                }
            }
        }
        int max = 0;
        for( String itm:subsL){
            System.out.println("itm:"+itm);
            if (max < itm.length()){
                max = itm.length();
            }
        }
        return max;
    }

    public static void main(String[] args) {
      //  System.out.println(LongestSubString.lengthOfLongestSubstring("aab"));
       // System.out.println(LongestSubString.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(LongestSubString.lengthOfLongestSubstring("dvdf"));
    }
}
