package com.recursion;

public class MergeSort {
   static int[] data = new int[] { -5, 20,10,3,4,2,0};

    public static void main(String[] args) {
        MergeSort.mergeSort(data,0,data.length-1);
        System.out.println("stop");
        for(int i = 0 ; i < data.length ; i++){
            System.out.print(data[i]+", ");
        }
    }
    public static void mergeSort(int[] data, int start, int end) {
        // base case
        if( start < end) {
            int mid = (start + end) / 2;
            mergeSort(data,start,mid);
            mergeSort(data,mid + 1,end);
            merge(data, start,mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end){
        // build temporary array to avoid modify the original contents
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        // while both sub-array have values, then tey and merge them in sorted order
        while( i <= mid && j <= end) {
            if( data[i] <= data[j]) {
                temp[k++] = data[i++];
            }else {
                temp[k++] = data[j++];
            }
        }
        // add the rest of the values from the left sub-array into the result
        while ( i <= mid) {
            temp[k] = data[i];
            k++; i++;
        }
        // add the rest of the values from the right sub-array into the result
        while ( j <= end) {
            temp[k] = data[j];
            k++; j++;
        }

        for ( i = start; i <= end; i++) {
            data[i] = temp[ i - start];
        }
    }
}
