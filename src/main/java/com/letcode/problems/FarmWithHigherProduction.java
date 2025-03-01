package com.letcode.problems;

import java.util.ArrayList;
import java.util.List;

public class FarmWithHigherProduction {


    public static void main(String[] args) {
        List<Farm> farmList = new ArrayList<>();

        farmList.add(new Farm("Farm1",10,17,11,11 ) );
        farmList.add(new Farm("Farm2",11,16,13,10 ) );
        farmList.add(new Farm("Farm3",12,14,12,12 ) );
        farmList.add(new Farm("Farm4",13,13,13,9 ) );
        farmList.add(new Farm("Farm5",14,13,15,10 ) );

        System.out.println("Before Sorting by production..");

        Node wheat = null;
        Node corn = null;
        Node sorghum = null;
        Node soy = null;
        for(Farm frm: farmList){
            wheat = NodeOperations.insert(wheat,frm.name,frm.wheat);
            corn = NodeOperations.insert(corn,frm.name,frm.corn);
            sorghum = NodeOperations.insert(sorghum,frm.name,frm.sorghum);
            soy = NodeOperations.insert(soy,frm.name,frm.soy);
            System.out.println(frm.toString());
        }
        NodeOperations.traverseTopTwo(soy,"soy");
        NodeOperations.traverseTopTwo(corn,"corn");
        NodeOperations.traverseTopTwo(sorghum,"sorghum");
        NodeOperations.traverseTopTwo(wheat,"wheat");

    }
}

class Node {
    String name;
    Double value;
    Node next;
    public Node(String name, Double value, Node next){
        this.name = name;
        this.value = value;
        this.next = next;
    }
}

class NodeOperations{

    public static Node insert(Node node, String name, Double value){
        if (node == null) {
            node = new Node(name,value,null);
        } else {
            Node iterator = node;
            while( iterator != null){
                if ( value.doubleValue() > iterator.value.doubleValue()) {
                    Node maxNode = new Node(name,value,iterator);
                    node = maxNode;
                    break;
                }if (value.doubleValue() < iterator.value.doubleValue()) {
                    if (iterator.next == null) {
                        iterator.next = new Node(name, value, null);
                        break;
                    }
                }if (value.equals(iterator.value)  ) {
                    Node minNode = new Node(name, value, iterator.next);
                    iterator.next = minNode;
                    break;
                }
                iterator = iterator.next;
            }

        }
     return node;
    }

    public static void traverseTopTwo(Node node,String seedName){
        Node iterator = node;
        int i = 0;
        while(iterator != null){
            System.out.println(iterator.name + " "+seedName+" quantity:"+iterator.value);
            iterator = iterator.next;
            i++;
            if (i > 1 ) {
                break;
            }
        }
    }
}

