package com.letcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
    }

    @Test
    void findMiddleNode() {
        assertEquals(3, linkedList.findMiddleNode().value);
    }

    @Test
    void findMiddleNodeEven() {
        linkedList.append(6);
        assertEquals(4, linkedList.findMiddleNode().value);
    }

    @Test
    void listHasALoop() {
        linkedList.getTail().next = linkedList.getHead().next;
        assertTrue(linkedList.hasLoop());
    }

    @Test
    void findTheKnthToLastNode() {
        assertEquals(3, linkedList.findKthFromEnd(3).value);
        assertEquals(4, linkedList.findKthFromEnd(2).value);
    }

    @Test
    void partitionList() {
        linkedList = new LinkedList(3);
        linkedList.append(5);
        linkedList.append(8);
        linkedList.append(10);
        linkedList.append(2);
        linkedList.append(1);
        linkedList.printList();
        linkedList.partitionList(5);
        assertEquals(8,linkedList.findKthFromEnd(2).value);
    }
}