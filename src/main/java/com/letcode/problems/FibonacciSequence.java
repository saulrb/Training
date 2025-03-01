package com.letcode.problems;

import java.util.HashMap;
import java.util.Map;

public class FibonacciSequence {

    static Map<Integer,Integer> memoizedCache = new HashMap<>();

    static {
        memoizedCache.put(1,1);
        memoizedCache.put(0,1);
    }

    public static int fib2(int n) {
        if(memoizedCache.containsKey(n)) {
            return memoizedCache.get(n);
        }
        int result = fib2( n - 1) + fib2(n -2);
        memoizedCache.put(n,result);
        return result;
    }

    public static double getSequence(int times){
        double values[] = calculateNextNumber(times);
        return values[0];
    }

    private static double[] calculateNextNumber( int times){
        double values[] = new double[3];
        if ( times > 0 ){
           values = calculateNextNumber(times -1);
        }
        if ( times == 0) {
            values[1] = 0;
            values[2] = 1;
            values[0] = values[1] + values[2];
        } else {
            values[0] = values[1] + values[2];
            values[1] = values[2];
            values[2] = values[0];
        }
        return values;
    }

    public static double getSequenceLineal(int times) {
        double value = 0;
        double x1 = 0;
        double x2 = 1;
        for(int i = 0; i < times; i++){
            value = x2 + x1;
            x1 = x2;
            x2 = value;
        }
        return value;
    }

    public static long fib(long n){
        if ( (n == 0) || (n == 1))
            return n;
        else
            return fib(n - 1) + fib (n - 2);
    }


}
