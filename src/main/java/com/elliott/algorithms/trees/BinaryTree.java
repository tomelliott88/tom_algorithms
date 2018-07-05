package com.elliott.algorithms.trees;

public class BinaryTree {

  private Node rootNode;

  public BinaryTree(int rootvalue) {
    this.rootNode = new Node(rootvalue);
  }

  public Node getRootNode() {
    return rootNode;
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

  public Node getLeftChild() {
    return leftChild;
  }

  public Node getRightChild() {
    return rightChild;
  }

}
