package com.letcode.problems;

import java.util.ArrayList;
import java.util.List;

public class LeafValueSequence {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return false;
    }

    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
    }
}

/**
 * Definition for a binary tree node. */

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
    public  TreeNode() {}
    public  TreeNode(int val) { this.val = val; }
    public  TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
