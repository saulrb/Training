package com.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinedListReversallTest {

    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);
    ListNode n5 = new ListNode(5);

    @BeforeEach
    void setUp() {
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
    }

    @Test
    void reverseList() {
        LinedListReversall.reverseList(n1);
        LinedListReversall.printList(n5);
        Assertions.assertTrue(true);
    }

    @Test
    void printList() {
        LinedListReversall.printList(n1);
        Assertions.assertTrue(true);
    }
}