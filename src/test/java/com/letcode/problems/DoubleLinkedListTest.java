package com.letcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    private DoubleLinkedList doubleLinkedList;

    @BeforeEach
    void setUp() {
        doubleLinkedList = new  DoubleLinkedList(1);
    }

    @Test
    void testGetHead() {
        assertNotNull(doubleLinkedList.getHead());
        assertEquals(1, doubleLinkedList.getHead().value);
    }

    @Test
    void testAppend() {
        doubleLinkedList.append(2);
        assertNotNull(doubleLinkedList.getTail());
        assertEquals(2, doubleLinkedList.getTail().value);
        assertEquals(2, doubleLinkedList.getLength());
    }

    @Test
    void testEmpty() {
        doubleLinkedList.makeEmpty();
        assertNull(doubleLinkedList.getHead());
        assertNull(doubleLinkedList.getTail());
        assertEquals(0, doubleLinkedList.getLength());
    }
    @Test
    void testRemoveLast(){
        doubleLinkedList.append(2);
        doubleLinkedList.removeLast();
        assertNotNull(doubleLinkedList.getHead());
        assertEquals(1, doubleLinkedList.getLength());
    }
    @Test
    void testPrepend(){
        doubleLinkedList.prepend(0);
        assertNotNull(doubleLinkedList.getHead());
        assertEquals(0, doubleLinkedList.getHead().value);
        assertEquals(2, doubleLinkedList.getLength());
    }

    @Test
    void testRemoveFirst(){
        doubleLinkedList.append(2);
        doubleLinkedList.removeFirst();
        assertNotNull(doubleLinkedList.getHead());
        assertEquals(1, doubleLinkedList.getLength());
    }

    @Test
    void testGetByIndex(){
        doubleLinkedList.append(2);
        doubleLinkedList.append(3);
        doubleLinkedList.append(4);
        doubleLinkedList.append(5);
        assertNotNull(doubleLinkedList.get(5));
        assertEquals(2, doubleLinkedList.get(2).value);
        assertEquals(3, doubleLinkedList.get(3).value);
        assertEquals(4, doubleLinkedList.get(4).value);
    }
}