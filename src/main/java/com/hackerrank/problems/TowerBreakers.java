package com.hackerrank.problems;

public class TowerBreakers {
    public static int towerBreakers(int n, int m) {
        // Write your code here
        int[] towers = new int[n];
        for(int i = 0; i < n ; i++){
            towers[i] = m;
        }
        int y = m ;
        while ( m % y != 0) {
            y--;
        }
        if (y == 1) {
            y = m;
        }
        boolean gameok= true;
        int max = 0;
        int i = 0;
        int player = 1;
        while(gameok){
            if ( i < n ){
                towers[i] = towers[i] - y >= 0? towers[i] - y: towers[i];
                if( max < towers[i]) {
                    max = towers[i];
                }
                i++;
            }
            if ( i == n ) {
                i = 0;
                y = towers[0] -1;
                if ( y == 0) {
                    gameok = false;
                }
                else{
                    while( towers[0] % y != 0) {
                        y--;
                    }
                }
                if ( max == 0) {
                    gameok = false;
                }
            }
            if (gameok) {
                player = player == 2 ? 1 : 2;
            }
        }
        return player;
    }

    public static void main(String[] args) {
        System.out.println("hello player won:"+towerBreakers(10001, 1));
       // System.out.println("hello player won:"+towerBreakers(2,2));
       // System.out.println("hello player won:"+towerBreakers(3,7));
    }
}
