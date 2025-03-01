package com.hackerrank.problems;

public class CaesarCipher {


    public static String caesarCipher(String s, int k){
        int moves = 0;
        if ( k > 26 ){
           moves =  k % 26;
        } else{
            moves = k;
        }
        StringBuffer sb = new StringBuffer();
        char[] message = s.toCharArray();
        for( int i = 0; i < message.length ; i++){
            if( (message[i] >64 && message[i] < 91) || (message[i] > 96 && message[i] <= 122) ) {
                sb.append(shiftChar(message[i], moves));
            } else {
                sb.append(message[i]);
            }
        }
        return sb.toString();
    }

    public static char shiftChar(char c, int k) {
        char value = 0;
        if (c > 64 && c < 91)  { // Upper case
            if ( c + k > 'Z' ) {
                value = (char) (64 + ( c + k - 90));
            } else{
                value = (char) (c + k);
            }
        }
        if ( c> 96 && c < 123 ) { // lower case
            if ( c + k > 'z' ) {
                value = (char) (96 + (c + k - 122));
            } else{
                value = (char) (c + k);
            }
        }
         return value;
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("www.abc.xy",87));
    }
}
