package com.elliott.algorithms.linkedlist;

public class LinkedList {

  private Link headLink;

  public LinkedList() {

  }

  public void addLink(Link link) {
    if(headLink == null) {
      headLink = link;
    } else if(!headLink.hasNextLink()) {
      headLink.addNextLink(link);
    } else {
      addLink(headLink.getNextLink(), link);
    }
  }

  private void addLink(Link currentLink, Link linkToAdd) {
    if(!currentLink.hasNextLink()) {
      currentLink.addNextLink(linkToAdd);
    } else {
      addLink(currentLink.getNextLink(), linkToAdd);
    }
  }

  // Note this is zero indexed. index 0 is the head link
  public void addLinkAtIndex(Link link, int index) {
    Link currentLink = headLink;
    for(int i = 0; i < index-1; i++) {
      if(currentLink == null || !currentLink.hasNextLink()) {
        return;
      }
      currentLink = currentLink.getNextLink();
    }

    //update the new link to point to the previous 'next'
    Link previousNextLink = currentLink.getNextLink();
    link.addNextLink(previousNextLink);

    //point the currentLink to our newly inserted link
    currentLink.addNextLink(link);

  }

  public Link getFirstLink() {
    return headLink;
  }

  @Override
  public String toString() {

    StringBuilder builder = new StringBuilder();

    builder.append(headLink.getValue() + ",");

    Link nextLink = headLink.getNextLink();

    while(nextLink != null) {
        builder.append(nextLink.getValue() + ",");
        nextLink = nextLink.getNextLink();
    }

    return builder.toString();
  }

}
