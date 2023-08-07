package com.infosys.questions;

public class Child extends Super{
    static int rand;
    static {
        rand = (int) Math.random() * 6;
        System.out.println("static block "+rand);
    }
    Child() {
        System.out.println("Constructor child");
    }

    public static void main(String[] args) {
        System.out.println(" in main");
        Child child = new Child();
    }
}
