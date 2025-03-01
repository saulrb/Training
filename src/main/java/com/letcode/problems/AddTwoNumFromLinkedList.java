package com.letcode.problems;

import java.util.List;

public class AddTwoNumFromLinkedList {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode l3Root = null;
        ListNode l3Item = null;
        ListNode l1Item = l1;
        ListNode l2Item = l2;
        int oper1 = 0; int oper2 = 0; int res = 0;
        int carry = 0;
        while( true){
            oper1 = 0; oper2 = 0;
            if ( l1Item != null ){
                oper1 = l1Item.val;
                l1Item = l1Item.next;
            }
            if ( l2Item != null ){
                oper2 = l2Item.val;
                l2Item = l2Item.next;
            }
            System.out.println("Oper1:"+oper1+" Oper2:"+oper2);
            if(carry > 0 ){
                res =  oper1 + oper2 + carry;
                carry = 0;
            }else {
                res = oper1 + oper2 ;
            }
            if ( res >= 10 ) {
                carry = 1;
                res = res - 10;
            }
            if (l3Root == null) {
                l3Root = new ListNode(res,null);
                l3Item = l3Root;
            } else{
                l3Item.next = new ListNode(res,null);
                l3Item = l3Item.next;
            }
            if (l1Item == null ) {
                if ( l2Item == null) {
                    break;
                }
            }
        }
        if ( carry > 0 ) {
            l3Item.next = new ListNode(carry,null);
            l3Item = l3Item.next;
        }
        return l3Root;
    }

    public static void main(String[] args) {
        ListNode l1r = new ListNode(2,null);
        ListNode l1i = l1r;
        l1i.next = new ListNode(4,null);
        l1i = l1i.next;
        l1i.next = new ListNode(9,null);
        ListNode l2r = new ListNode(5,null);
        ListNode l2i = l2r;
        l2i.next = new ListNode(6,null);
        l2i = l2i.next;
        l2i.next = new ListNode(4,null);
        l2i = l2i.next;
        l2i.next = new ListNode(9,null);
        ListNode l3r = addTwoNumbers(l1r,l2r);
        ListNode l3n = l3r;
        while(l3n != null){
            System.out.println("Node:"+l3n.val);
            l3n = l3n.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}