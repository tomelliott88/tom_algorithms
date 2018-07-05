package com.elliott.algorithms.trees;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class BinaryTreeTest {

  @Test
  public void testCreatingSingleNodeTree() {
    BinaryTree binaryTree = new BinaryTree(40);
    assertEquals("Assert root node value", 40, binaryTree.getRootNode().getData());
  }

  @Test
  public void testAddingSingleNode() {
    BinaryTree binaryTree = new BinaryTree(40);
    binaryTree.addNode(30);
    assertEquals("Assert root node value", 40, binaryTree.getRootNode().getData());
    assertEquals("Assert added node value", 30, binaryTree.getRootNode().getLeftChild().getData());
  }

  @Test
  public void testAddBothChildren() {
    BinaryTree binaryTree = new BinaryTree(40);
    binaryTree.addNode(30);
    binaryTree.addNode(50);
    assertEquals("Assert root node value", 40, binaryTree.getRootNode().getData());
    assertEquals("Assert added node value", 30, binaryTree.getRootNode().getLeftChild().getData());
    assertEquals("Assert added node value", 50, binaryTree.getRootNode().getRightChild().getData());
  }
}
