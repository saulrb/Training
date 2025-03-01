package com.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedMergeLinkedListsTest {

    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(5);
    ListNode n3 = new ListNode(13);
    ListNode n4 = new ListNode(14);
    ListNode n5 = new ListNode(550);

    ListNode n1_1 = new ListNode(2);
    ListNode n2_2 = new ListNode(15);
    ListNode n3_3 = new ListNode(130);
    ListNode n4_4 = new ListNode(200);
    ListNode n5_5 = new ListNode(350);

    @BeforeEach
    void setUp() {
        n1_1.setNext(n2_2);
        n2_2.setNext(n3_3);
        n3_3.setNext(n4_4);
        n4_4.setNext(n5_5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
    }

    @Test
    void SortedMerge(){
        ListNode node = SortedMergeLinkedLists.SortedMerge(n1,n1_1);
        SortedMergeLinkedLists.printList(node);
    }

}