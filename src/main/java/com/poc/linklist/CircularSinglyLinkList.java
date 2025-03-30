package com.poc.linklist;

import java.util.NoSuchElementException;

public class CircularSinglyLinkList {

    private LinkNode last;
    private int length;

    private class LinkNode {
        private LinkNode next;
        private int data;

        LinkNode(int data) {
            this.data = data;
        }
    }

    CircularSinglyLinkList() {
        last = null;
        length = 0;
    }

    // length of link list
    public int length() {
        return length;
    }

    //isEmpty
    public boolean isEmpty() {
        return length == 0;
    }

    //print and traverse circular link list
    public void printCircular() {
        if (last == null) {
            return;
        }
        LinkNode first = last.next;
        while (first != last) {
            System.out.print(first.data + "-->");
            first = first.next;
        }
        System.out.println(first.data + "-->");
    }

    //insert node at start position
    public void insertNode(int value) {
        LinkNode temp = new LinkNode(value);
        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    //remove first node
    public LinkNode removeFirstNode() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        LinkNode temp=last.next;
        if (last.next==last){
            last=null;
        }else {
            last.next=temp.next;
        }
        temp.next=null;
        length--;
        return temp;
    }


    //create circular link list
    public void createCircularLinkList() {
        LinkNode firstNode = new LinkNode(1);
        LinkNode secondNode = new LinkNode(2);
        LinkNode thirdNode = new LinkNode(3);
        LinkNode fourthNode = new LinkNode(4);
        LinkNode fiveNode = new LinkNode(5);

        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fiveNode;
        fiveNode.next = firstNode;

        last = fiveNode;
    }

    public static void main(String[] args) {
        CircularSinglyLinkList cll = new CircularSinglyLinkList();
        cll.createCircularLinkList();
        //cll.printCircular();
        cll.insertNode(6);
        cll.printCircular();

    }
}
