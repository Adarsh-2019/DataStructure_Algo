package com.poc.linklist;

public class DoublyLinkedList {
   static class Node{
        Character data;
        Node prev;
        Node next;
    };

   static Node push(Node head, Character data){
       Node new_node=new Node();
       new_node.data=data;
       new_node.next=head;
       new_node.prev=null;
       if (head != null)
           head.prev = new_node ;
       head = new_node;
       return head;
   }

   static boolean isPalindrome(Node left)
    {
        if (left == null)
            return true;

        // Find rightmost node
        Node right = left;
        while (right.next != null)
            right = right.next;

        while (left != right)
        {
            if (left.data != right.data)
                return false;

            left = left.next;
            right = right.prev;
        }

        return true;
    }

    public static void main(String[] args)
    {
        Node head = null;
        head = push(head, 'l');
        head = push(head, 'e');
        head = push(head, 'v');
        head = push(head, 'e');
        head = push(head, 'l');

        if (isPalindrome(head))
            System.out.printf("It is Palindrome");
        else
            System.out.printf("Not Palindrome");
    }
}
