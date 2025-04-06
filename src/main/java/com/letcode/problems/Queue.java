package com.letcode.problems;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Queue(int value){
        first = new Node(value);
        last = first;
        length++;
    }

    public Node getFirst(){
        return first;
    }
    public Node getLast(){
        return last;
    }
    public void printQueue(){
        Node current = first;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = first;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }
    public Node dequeue() {
        if (length == 0) {
            return null;
        }
        Node temp = first;
        if (first == last) {
            last = null;
        }
        first = first.next;
        length--;
        return temp;
    }

}
