package com.poc.linklist;

public class DoublyLinkList {

    private LinkNode head;
    private LinkNode tail;
    private int length;

    private class LinkNode {
        private int data;
        private LinkNode next;
        private LinkNode previous;

        LinkNode(int data) {
            this.data = data;
        }
    }

    //initialize doubly link list
    public DoublyLinkList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    //check list is empty
    public boolean isEmpty() {
        return length == 0;
    }

    //check length
    public int length() {
        return length;
    }

    //insert at last
    public void insertAtLast(int value) {
        LinkNode newNode = new LinkNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    //print forward direction
    public void printForward() {
        LinkNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //print backward direction
    public void printBackward() {
        LinkNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    //insert the node at beginning
    public void insertAtBeginning(int value) {
        LinkNode newNode = new LinkNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    //insert node at end of doubly link list
    public void insertNodeAtEnd(int value){
        LinkNode newNode=new LinkNode(value);
        if (isEmpty()){
            head=newNode;
        }else {
            tail.next=newNode;
        }
        newNode.previous=tail;
        tail=newNode;
    }

    //delete first node from link list
    public LinkNode deleteFirstNode(){
        if(isEmpty()){
            throw new IllegalArgumentException("Invalid deletion");
        }

        LinkNode temp=head;
        if(tail==head){
            tail=null;
        }else {
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        return temp;
    }

    //delete last node from link list
    public LinkNode deleteLastNode(){
        if(isEmpty()){
            throw new IllegalArgumentException("Invalid deletion");
        }

        LinkNode temp=tail;
        if(tail==head){
            head=null;
        }else {
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkList dll = new DoublyLinkList();
        dll.insertAtLast(2);
        dll.insertAtLast(3);
        dll.insertAtLast(4);
        dll.insertAtLast(5);
        dll.insertAtLast(6);

        //dll.printForward();

        //dll.printBackward();

        //dll.insertAtBeginning(1);

        //dll.printForward();

        //dll.insertNodeAtEnd(7);

        //dll.deleteFirstNode();

        //dll.deleteLastNode();
    }
}
