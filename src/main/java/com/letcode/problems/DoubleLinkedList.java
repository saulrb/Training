package com.letcode.problems;

public class DoubleLinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }
    public DoubleLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) {
            return null;
        }
        Node temp = tail;
        if(length == 1){
            tail = null;
            head = null;
        }else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0){
            return null;
        }
        Node temp = head;
        if ( length == 1){
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if( index > length || index < 0){
            return null;
        }
        Node temp = null;
        if(index < (length / 2) ){
            temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index,int value){
        Node nottoSet = get(index);
        if (nottoSet != null) {
            nottoSet.value = value;
            return true;
        }
        return false; // Return false if the index is invalid or node not found
    }

    public boolean insert(int index, int value){
        if (index < 0 || index > length) {
            return false; // Invalid index
        }
        Node newNode = new Node(value);
        if (index == 0) { // Insert at the head
            prepend(value);
            return true;
        } else if (index == length) { // Insert at the tail
            append(value);
            return true;
        } else {
            Node current = get(index);
            if (current != null) {
                newNode.prev = current.prev;
                newNode.next = current;
                if (current.prev != null) {
                    current.prev.next = newNode;
                }
                current.prev = newNode;
                if (current == head) {
                    head = newNode; // Update head if inserting at the start
                }
                length++;
                return true;
            }
        }
        return false; // Insertion failed
    }
}
