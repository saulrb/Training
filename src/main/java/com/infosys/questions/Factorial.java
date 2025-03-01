package com.infosys.questions;

public class Factorial {

    private static int getFactorial(int factorial){
        if ( factorial == 0){
            return 1;
        }
        return factorial * getFactorial(factorial - 1);
    }
    public static void main(String[] args) {
        int f = 5;
        int fact = 1;
        System.out.println("Factorial recursive is: "+getFactorial(f));

        for(int i=1; i<=f; i++){
            fact = fact * i;
        }
        System.out.println("Factorial linear is "+fact);
    }
}
