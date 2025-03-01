package com.recursion;

public class TreeOperations {

    public static Node insertNode(Node head, int data){
        if (head == null){
            return new Node(null,null,data);
        }
        if ( head.getValue() < data) {
            head.setRight(insertNode(head.getRight(),data));
        }else {
            head.setRight(insertNode(head.getLeft(),data));
        }
        return  head;
    }

    public static void printLeaves(Node root){
        if ( root == null) return;

        if( root.getLeft() == null && root.getRight() == null) {
            System.out.println(root.getValue() + ",");
            return;
        }
        if (root.getLeft() != null) {
            printLeaves(root.getLeft());
        }
        if (root.getRight() != null) {
            printLeaves(root.getRight());
        }
    }
}
