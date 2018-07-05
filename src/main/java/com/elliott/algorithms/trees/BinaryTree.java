package com.elliott.algorithms.trees;

public class BinaryTree {

  private Node rootNode;

  public BinaryTree(int rootvalue) {
    this.rootNode = new Node(rootvalue);
  }

  public Node getRootNode() {
    return rootNode;
  }

  public void addNode(int value) {
      addNode(value, getRootNode());
  }

  private void addNode(int value, Node node) {
    //is data greater than or less than rootNode
    int currentData = node.getData();

    if(value < currentData) {
      //needs to go left
      addNode(value, node.getLeftChild());
    } else if(node.getData() > currentData) {
      //needs to go rightChild
      addNode(value, node.getRightChild());
    } else {
      //this is where it should live
      node.setData(currentData);
    }
  }

}

class Node {

  private int data;
  private Node leftChild;
  private Node rightChild;

  public Node(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getLeftChild() {
    return leftChild;
  }

  public Node getRightChild() {
    return rightChild;
  }

}
