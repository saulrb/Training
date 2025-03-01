package com.graphs.bsf;

import java.util.*;

public class ShortestPermutations {
  private String startWord;
  private String endWord;
  private List<String> listOfWords;
  private List<Node> visitedNodes = new LinkedList<>();
  int myCounter = 0;

  public ShortestPermutations() {}

  public ShortestPermutations(String startWord, String endWord, List<String> listOfWords) {
    this.startWord = startWord;
    this.endWord = endWord;
    this.listOfWords = listOfWords;
  }

  public int transformation(int x, int y) {
    int result = x * y;
    return result;
  }

  public int transformations() {
    this.myCounter--;
    if (!isInWordInList()) return 0;
    var listofNodes = generateListOfNodes(listOfWords);
    var currentNode = new Node(startWord);
    do {
      for (Node node : listofNodes) {
        if (isOneWordDifferent(currentNode.getNodeName(), node.getNodeName())
            && !visitedNodes.contains(node)) {
          System.out.println("current Node:" + currentNode.getNodeName());
          System.out.println("Next node:" + node.getNodeName());
          currentNode.getNextNodes().add(node);
        }
      }
      visitedNodes.add(currentNode);
      if (currentNode.getNextNodes().isEmpty()) break;
      currentNode = currentNode.getNextNodes().get(0);
    } while (true);
    return visitedNodes.size() - 1;
  }

  private List<Node> generateListOfNodes(List<String> listOfWords) {
    myCounter = 10;
    List<Node> nodeList = new LinkedList<>();
    for (String word : listOfWords) {
      nodeList.add(new Node(word));
    }
    return nodeList;
  }

  private boolean isOneWordDifferent(String word1, String word2) {
    int different = 0;
    for (int i = 0; i < word1.length(); i++) {
      if (word1.charAt(i) != word2.charAt(i)) different++;
    }
    return (different == 1);
  }

  private boolean isInWordInList() {
    for (String word : listOfWords) {
      if (word.equals(endWord)) return true;
    }
    return false;
  }
}
