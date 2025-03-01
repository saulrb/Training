package com.infosys.questions;

public class ChessBoardColorFinder {
    public static final String COLOR_BLACK ="Black";
    public static final String COLOR_WHITE = "White";

    public static String colorFinder(int row, int column) {
        return ( row % 2) == (column % 2) ? COLOR_WHITE : COLOR_BLACK;
    }

    public static String colorFinder2(int row, int column) {
        return ( row + column ) % 2  == 0 ? COLOR_WHITE : COLOR_BLACK;
    }

    public static void main(String[] args) {
        for( int i = 1; i <= 8 ; i++)
            for(int j = 1; j <= 8; j++){
                System.out.println(" Row:"+i+" Column:"+j+" Color:"+colorFinder2(i,j));
            }
        System.out.println("-------------------------------------------- ");
        for( int i = 1; i <= 8 ; i++)
            for(int j = 1; j <= 8; j++){
                System.out.println(" Row:"+i+" Column:"+j+" Color:"+colorFinder(i,j));
            }
    }
}
