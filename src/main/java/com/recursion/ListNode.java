package com.recursion;

public class ListNode {

    public ListNode next;
    public Integer value;

    public ListNode(int val){
        this.value = val;
    }

    public void setNext(ListNode node){
        this.next = node;
    }

    public ListNode getNext(){
        return this.next;
    }

}
