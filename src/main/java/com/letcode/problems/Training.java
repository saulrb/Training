package com.letcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Training {


    static List<Integer> arr = new ArrayList<>();

    static {
        for( int i = 16; i > 0; i--){
            arr.add(i);
        }
    }

    public  static double calculateMedian(List arr){
        double median = 0;
        Integer[] array = new Integer[arr.size()];
        array = (Integer[]) arr.toArray(array);
        for(int i = 0; i < array.length ; i++){
            for( int j = i + 1; j < array.length; j++ ){
                if ( array[i].intValue() > array[j].intValue()){
                    Integer temp = array[i].intValue();
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int pos = array.length / 2;
        System.out.println(" Pos:"+pos);
        if (array.length % 2 == 0) { // even
            median = ( array[pos].doubleValue() + array[pos+1].doubleValue() ) / 2;
        } else { // Odd
            median = ( array[pos] );
        }
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
        return median;
    }

    public static void main(String[] args) {
        System.out.println( calculateMedian(arr)) ;
    }
}
