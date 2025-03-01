package com.infosys.questions;

public class FindPalindrome {
    public static void main(String[] args) {
        String sample = "madam";
        StringBuilder sb = new StringBuilder(sample);
        sb.reverse();
        String reversed = sb.toString();
        System.out.println( " It is"+ (reversed.equals(sample) ? " ": "not " )+" a palindrome ");
    }
}
