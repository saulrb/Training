package com.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TreeOperationsTest {

    Stream<Integer> dataInput;
    final Node[] root = {null};
    @BeforeEach
    void setUp() {
        dataInput = Stream.of(100,80,50,90,85,95,120,110,108,115,14,150);
    }

    @Test
    void insertNode() {
        dataInput.forEach( item -> {
            System.out.println(item);
            root[0] = TreeOperations.insertNode(root[0],item);
        });
        TreeOperations.printLeaves(root[0]);
    }

    @Test
    void printLeaves() {
        dataInput.forEach( item -> {
            System.out.println(item);
            root[0] = TreeOperations.insertNode(root[0],item);
        });
        TreeOperations.printLeaves(root[0]);
    }
}