package com.letcode.problems;

public class MedianOfTwoArr {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int max = length1 >= length2 ? length1 : length2;
        int accumulation = 0;
        System.out.println("max:"+max);
        for(int i = 0; i < max ; i++){
            accumulation = i < length1 ? accumulation + nums1[i] : accumulation;
            accumulation = i < length2 ? accumulation + nums2[i] : accumulation;
        }
        Double acc = Double.valueOf(accumulation);
        Double size = Double.valueOf(length1 + length2);
        System.out.println("acc:"+accumulation+" Size:"+size);
        return ( acc / size ) ;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {7,2};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
}
