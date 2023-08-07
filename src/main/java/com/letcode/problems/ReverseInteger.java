package com.letcode.problems;

/*
Refer to unit test for validation and running
 */
public class ReverseInteger {

    public static long reverse(long x){
        Long value = Long.valueOf(x);
        String valueS = value.toString();
        String reversedS = valueS.charAt(0) == '-' ? "-" : "";
        for(int i = valueS.length() - 1 ; i >= 0 ; i--) {
            reversedS = valueS.charAt(i) != '-' ? reversedS + valueS.charAt(i) : reversedS;
        }
        Long newValue = Long.parseLong(reversedS);
        if( newValue.longValue() > Integer.MAX_VALUE || newValue.longValue() < Integer.MIN_VALUE ) {
            return 0;
        }
        return newValue.intValue();
    }
}
