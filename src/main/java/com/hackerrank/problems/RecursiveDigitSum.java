package com.hackerrank.problems;

public class RecursiveDigitSum {

    public static int superDigit(String n, int k) {
        // Write your code here
        long accum = Long.parseLong(n);
        int single = getOneSingle(accum,k).intValue();
        return single;
    }

    public static Long getOneSingle(Long val, int k){
        long accum = 0l;
        for(int j = 0; j < val.toString().length() ; j++){
            accum+= Long.parseLong(String.valueOf(val.toString().charAt(j)));
        }
        if ( k > 0){
            accum = accum * k;
        }
        if ( accum >= 10) {
            accum = getOneSingle(accum,0);
        }
        return accum;
    }

    public static void main(String[] args) {
        String sample = "1";
        int k = 1;

        System.out.println(superDigit(sample,k));
    }
}
