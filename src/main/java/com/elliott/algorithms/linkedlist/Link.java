package com.elliott.algorithms.linkedlist;

public class Link {

  private Link nextLink;
  private int value;

  public Link(int value) {
    this.value = value;
  }

  public void addNextLink(Link nextLink) {
    this.nextLink = nextLink;
  }

  public boolean hasNextLink() {
    return this.nextLink != null;
  }

  public Link getNextLink() {
    return this.nextLink;
  }

  public int getValue() {
    return value;
  }

}
