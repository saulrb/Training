package com.recursion;

public class LinedListReversall {

    public static ListNode reverseList(ListNode head){
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void printList(ListNode node){
        ListNode temp = node;
        while( temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.getNext();
        }
    }


}
