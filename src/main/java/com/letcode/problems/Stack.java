package com.letcode.problems;

public class Stack {
    Node top;
    int height;

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Stack(int value) {
        this.top = new Node(value);
        this.height = 1;
    }

    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.println(current.value + " ");
            current = current.next;
        }
    }

    public void getTop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element is: " + top.value);
        }
    }

    public void getHeight() {
        System.out.println("Stack height is: " + height);
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

}
