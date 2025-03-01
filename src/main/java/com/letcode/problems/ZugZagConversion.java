package com.letcode.problems;

import java.util.ArrayList;
import java.util.List;

public class ZugZagConversion {
    public static String convert(String s, int numRows) {
        List<StringBuilder> sbArr = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            sbArr.add(new StringBuilder());
        }
        int currRow = 0;
        int i = 0;
        boolean inc = true;
        while( i < s.length() ) {
            sbArr.get(currRow).append(s.charAt(i));
            i++;
            if( inc && currRow < numRows ) {
                currRow++;
            }else if ( !inc && currRow > 0){
                currRow--;
            }
            if( currRow == numRows) {
                inc = false;
                currRow--;
            }
            if( currRow == numRows -1 ) {
                inc = false;
            }
            if (currRow == 0) {
                inc = true;
            }
        }
        String result = "";
        for(StringBuilder bl:sbArr){
            result = result + bl.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        //"PAYPALISHIRING"
        //3
        System.out.println(convert("PAYPALISHIRING",3));
    }
}
