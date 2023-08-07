package com.graphs.bsf;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private String nodeName;
    private List<Node> nextNodes;

    public Node(String name){
        nodeName = name;
        nextNodes = new LinkedList<>();
    }

    public String getNodeName() {
        return nodeName;
    }

    public List<Node> getNextNodes() {
        return nextNodes;
    }
}
