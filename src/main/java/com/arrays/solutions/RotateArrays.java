package com.arrays.solutions;

import java.util.Arrays;

public class RotateArrays {
    public void rotate(int[] nums, int k){
        if(k > nums.length)
            k = k % nums.length;
        int[] result = new int[nums.length];
        for(int i = 0; i < k ; i++) {
            result[i] = nums[nums.length - k+i];
        }
        int j=0;
        for(int i=k; i < nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy( result, 0, nums, 0, nums.length);
    }

    public void bubbleRotate(int[] nums, int order) {
        for(int i = 0; i < order; i++) {
            for (int j = nums.length - 1; j > 0 ; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }

    public void reversalRotate(int[] arr, int order){
        if( arr == null || arr.length == 0 || order < 0){
            throw new IllegalArgumentException("Illegal argument!");
        }

        if( order > arr.length ) {
            order = order % arr.length;
        }

        int a = arr.length - order;
        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length -1);
        reverse(arr, 0, arr.length -1);
    }
    private void reverse(int[] arr, int left, int right){
        if(arr == null || arr.length == 1)
            return;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
