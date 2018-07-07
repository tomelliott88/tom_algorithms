package com.elliott.algorithms.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class LinkedListTest {

  @Test
  public void testCreationOfSingleLink() {
    Link link = new Link(40);
    assertEquals(link.getValue(), 40);
  }

  @Test
  public void testCreateShortList() {
    LinkedList linkedList = new LinkedList();
    linkedList.addLink(new Link(50));
    assertEquals(linkedList.getFirstLink().getValue(), 50);
  }

  @Test
  public void testPrint() {
    LinkedList linkedList = new LinkedList();
    linkedList.addLink(new Link(50));
    linkedList.addLink(new Link(40));
    linkedList.addLink(new Link(20));
    linkedList.addLink(new Link(10));
    assertEquals(linkedList.toString(), "50,40,20,10,");
  }

  @Test
  public void testAddLinkInMiddleOfList() {
    LinkedList linkedList = new LinkedList();
    linkedList.addLink(new Link(50));
    linkedList.addLink(new Link(40));
    linkedList.addLink(new Link(20));
    assertEquals(linkedList.toString(), "50,40,20,");
    linkedList.addLinkAtIndex(new Link(10), 2);
    assertEquals("50,40,10,20,", linkedList.toString());
    linkedList.addLinkAtIndex(new Link(60), 1);
    assertEquals("50,60,40,10,20,", linkedList.toString());
  }



}
