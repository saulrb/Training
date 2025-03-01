package com.letcode.problems;

public class InvertAndFlip {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            image[i] = invertRow(image[i]);
            image[i] = flipRow(image[i]);
        }
        return image;
    }

    public static int[] invertRow(int[] row) {
        int j = row.length -1;
        for(int i = 0; i < row.length; i++){
            if ( i >= j) {
                int tmp = row[i];
                row[i] = row[j];
                row[j] = tmp;
            }
            j--;
        }
        return row;
    }

    public static int[] flipRow(int[] row) {
        for(int i = 0; i < row.length; i++){
            if ( row[i] == 0) {
                row[i] = 1;
            }else {
                row[i] = 0;
            }
        }
        return row;
    }

    public static void main(String[] args) {
        int[][]  image = {{1,1,0},{1,0,1},{0,0,0}};
        image = flipAndInvertImage(image);
        for(int i = 0 ; i < image.length; i++){
            for(int j = 0; j < image.length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println("");
        }
    }
}
