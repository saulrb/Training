package com.letcode.problems;

import java.util.List;

public class SumOfTow {

    static int[] position = new int[2];

    public static int[] towSum(List<Integer> nums, int target){
        int j = 0;
        int i = 0;
        boolean found = false;
        for( ;i < nums.size() ; i++ ){
            j = nums.size()-1;
            while ( j > i && !found ) {
                if ( (nums.get(i).intValue() + nums.get(j).intValue()) == target){
                    found = true;
                    position[0] = i;
                    position[1] = j;
                    break;
                }
                if (j > 0) j--;
            }
            if ( found )
                break;
        }
        return position;
    }

    public static int[] highestSum(List<Integer> nums){
        int i = 0;
        int j = nums.size() - 1;
        double max = 0;
        while( i < nums.size()) {
            if( j > i && ( nums.get(i).intValue() + nums.get(j).intValue() ) > max ) {
                max = nums.get(i).intValue() + nums.get(j).intValue();
                position[0] = i;
                position[1] = j;
            }
            if( i == j ) {
                i++;
                j = nums.size() - 1;
            } else {
                j--;
            }
        }
        return position;
    }

}
