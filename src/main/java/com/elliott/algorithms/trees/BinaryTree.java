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
      if(node.getLeftChild() != null) {
        addNode(value, node.getLeftChild());
      } else {
        node.setLeftChild(new Node(value));
      }
    } else if(value > currentData) {
      //needs to go rightChild
      if(node.getRightChild() != null) {
        addNode(value, node.getRightChild());
      } else {
        node.setRightChild(new Node(value));
      }
    } else {
      //this is where it should live
      node.setData(currentData);
    }
  }

  public String printPreOrderTraversal() {
    StringBuilder builder = new StringBuilder();
    return printPreOrderTraversal(getRootNode(), builder).toString();
  }

  private StringBuilder printPreOrderTraversal(Node node, StringBuilder builder) {
      if(node.getLeftChild() != null) {
        printPreOrderTraversal(node.getLeftChild(), builder);
      }

      if(node.getRightChild() != null) {
        printPreOrderTraversal(node.getRightChild(), builder);
      }

      return builder.append(node.getData() + ",");
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

  public void setLeftChild(Node node) {
    this.leftChild = node;
  }

  public void setRightChild(Node node) {
    this.rightChild = node;
  }
}
