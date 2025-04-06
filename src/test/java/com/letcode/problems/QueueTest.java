package com.letcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new Queue(1);
    }

    @Test
    void testEnqueue() {
        queue.enqueue(2);
        queue.enqueue(3);
        queue.printQueue();
        assertEquals(3, queue.getLast().data);
        assertEquals(1, queue.getFirst().data);
    }

    @Test
    void testDequeue() {
        queue.enqueue(2);
        queue.enqueue(3);
        queue.printQueue();
        assertEquals(1, queue.dequeue().data);
        assertEquals(2, queue.getFirst().data);
        assertEquals(3, queue.getLast().data);
    }
}