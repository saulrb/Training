package com.hackerrank.problems;

import java.util.Arrays;
import java.util.List;

public class JesseAndCookies {

    public static int cookies(int k, List<Integer> A){
        int minS1 = Integer.MIN_VALUE;
        int minS2 = Integer.MIN_VALUE;
        int sweetness = 0;
        for(Integer item : A) {
            if ( item.intValue() > minS1  ) {
                minS1 = item.intValue();
                continue;
            }
            if( item.intValue() > minS2) {
                minS2 = item.intValue();
            }
        }
        return sweetness;
    }

    public static void main(String[] args) {
        List<Integer> cookieList =  Arrays.asList(2,7,3,6,4,6);
        int k = 9;
        System.out.println(cookies(k,cookieList));
    }

}
