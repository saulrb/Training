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

    public Node remove(int index){
        if (index < 0 || index >= length) {
            return null; // Invalid index
        }
        Node toRemove = get(index);
        if (toRemove == null) {
            return null; // Node not found
        }

        if (toRemove == head) { // Removing the head
            return removeFirst();
        } else if (toRemove == tail) { // Removing the tail
            return removeLast();
        } else { // Removing a middle node
            toRemove.prev.next = toRemove.next;
            toRemove.next.prev = toRemove.prev;
            toRemove.next = null;
            toRemove.prev = null;
            length--;
            return toRemove;
        }
    }

    public void swapFirstLast() {
        if (length > 1) {
            int tempTailValue = tail.value;
            tail.value = head.value;
            head.value = tempTailValue;
        }
    }

    public void reverse() {
        if (length > 1) {
            Node tmp1 = new Node(tail.value);
            tmp1.prev = tail.next;
            tmp1.next = tail.prev;
            head = tmp1;
            System.out.println(">>>"+head.value);
            Node tempT = head.next;
            while(tempT != null){
                System.out.println(">>>"+tempT.value);
                Node tmp = new Node(0);
                tmp.prev = tempT.next;
                tmp.next = tempT.prev;
                tempT.prev = tmp.prev;
                tempT.next = tmp.next;
                if( tempT.next == null){
                    tail = tempT;
                }
                tempT = tempT.next;
            }
        }
    }

    public boolean isPalindrome(){
        if(length == 0){
            return true;
        }
        Node left = head;
        Node right = tail;
        while(left != null && right != null && left != right && left.prev != right){
            if(left.value != right.value){
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }

    public void swapPairs() {
        if (length > 1) {
            Node temp1 = head;
            Node temp2 = head.next;
            while (temp1.next != null) {
                // Swap values of current and next nodes
                Node tmp = new Node(temp1.value);
                tmp.prev = temp1.prev;
                tmp.next = temp1.next;
                temp1.next = temp2.next;
                temp1.prev = temp2;
                if(temp2.next != null){
                    temp2.next.prev = temp1;
                }
                temp2.next = temp1;
                temp2.prev = tmp.prev;
                if(temp2.prev != null){
                    temp2.prev.next = temp2;
                }
                if (temp1.next != null) {
                    temp1.next.prev = temp1;
                }
                if (head.prev != null) {
                    head = temp2;
                }
                if(temp1.next != null){
                    temp1 = temp1.next;
                }
                if(temp1.next != null){
                    temp2 = temp1.next;
                }
            }
            tail = temp1;
        }
    }
}
