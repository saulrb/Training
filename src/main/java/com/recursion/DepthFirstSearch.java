package com.recursion;

import java.util.Set;

public class DepthFirstSearch {

    public boolean depthFirstSearch(NodeDFS node, Set<NodeDFS> visited, int goal) {
        // Base cases
        if (node == null) return false;

        if (node.val == goal) {
            return  true;
        }
        // Finding more nodes
        for( NodeDFS neighbor : node.getNeighbors()) {
            if ( visited.contains(neighbor)) continue;;
            visited.add(neighbor);
            boolean isFound = depthFirstSearch(neighbor,visited,goal);
            if (isFound) return  true;
        }
        // last base case
        return false;
    }
}
