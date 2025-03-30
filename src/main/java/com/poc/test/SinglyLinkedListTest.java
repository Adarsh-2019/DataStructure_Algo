package com.poc.test;

public class SinglyLinkedListTest {

    private static ListNode head;

    private static class ListNode {

        private final int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //print the node
    public void printNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    //insert node
    public static void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode second = new ListNode(4);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(7);
        ListNode fifth = new ListNode(14);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        //fifth.next=second;

        SinglyLinkedListTest sl = new SinglyLinkedListTest();
        sl.printNode(head);
    }
}
