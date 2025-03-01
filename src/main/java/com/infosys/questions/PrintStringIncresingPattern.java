package com.infosys.questions;

public class PrintStringIncresingPattern {

    public static void main(String[] args) {
        String test = "JAVAJ2EE";
        for(int i =  0; i < test.length(); i++){
            System.out.println(test.substring(0,i+1));
        }
    }
}
