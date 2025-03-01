package com.recursion;

public class SortedMergeLinkedLists {

    public static ListNode SortedMerge(ListNode a, ListNode b){
        if( a == null) return b;
        if( b == null) return a;

        if(a.value < b.value) {
            a.next = SortedMerge(a.next,b);
            return a;
        }else {
            b.next = SortedMerge(a, b.next);
            return b;
        }
    }

    public static void printList(ListNode node){
        ListNode temp = node;
        while( temp != null) {
            System.out.println(temp.value + " ");
            temp = temp.getNext();
        }
    }
}
