package com.letcode.problems;

import java.util.HashSet;
import java.util.Set;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node findMiddleNode(){
        if(head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while( fast!= null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean hasLoop(){
        if(head == null || head.next == null) {
            return false;
        }
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast) {
                return true;
            }
        }
        return slow == fast;
    }

    public Node findKthFromEnd(int k){
        if ( head == null ){
            return null;
        }
        if (head.next == null) {
            if( k == 1) {
                return head;
            }
            return null;
        }
        Node fast = head;
        Node slow = head;

        for(int i = 0 ; i< k ; i++){
            if(fast.next == null){
                return null;
            }
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public void partitionList(int x){
        if(head != null && head.next != null){
            Node smlHead = null;
            Node smlTail = null;
            Node highHead = null;
            Node highTail = null;
            Node trav = head;
            while(trav != null){
                if( trav.value < x) {
                    if(smlHead == null){
                        smlHead = trav;
                        smlTail = trav;
                    } else {
                        smlTail.next = trav;
                        smlTail = trav;
                    }
                } else {
                    if(highHead == null) {
                        highHead = trav;
                        highTail = trav;
                    } else {
                        highTail.next = trav;
                        highTail = trav;
                    }
                }
                trav = trav.next;
            }
            if(smlTail != null) {
                smlTail.next = highHead;
            }
            if(highTail != null) {
                highTail.next = null;
            }
            if(smlHead != null){
                head = smlHead;
            }else {
                head = highHead;
            }
        }
    }
    public void removeDuplicates() {
        if (head != null && head.next != null) {
            Set<Integer> values = new HashSet<>();
            Node trav = head;
            Node prev = head;
            System.out.println("Adding " + prev.value);
            values.add(prev.value);
            while ( trav.next != null) {
                trav = trav.next;
                if (!values.contains(trav.value)) {
                    System.out.println("Adding " + trav.value);
                    values.add(trav.value);
                    prev = prev.next;
                } else {
                    System.out.println("Removing " + trav.value);
                    prev.next = trav.next;
                    length--;
                }
                System.out.println("prev: " + prev.value + " trav: " + trav.value);
            }
        }
    }

    public int binaryToDecimal(){
        int sum = 0;
        int pow = length-1;
        if(head == null){
            return 0;
        }
        Node trav = head;
        while( trav != null) {
            sum = (int) (sum + Math.pow(2,pow) * trav.value);
            pow--;
            trav = trav.next;
        }
        return sum;
    }
}
