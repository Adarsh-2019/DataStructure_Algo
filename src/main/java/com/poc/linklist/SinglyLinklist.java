package com.poc.linklist;

class SinglyLinklist {
    private static ListNode head;

    private static class ListNode {
        private final int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //print singly link list
    public void printNode(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
    }

    //find the length of the singly link list
    public void findLength() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println(count);
    }

    //insert new node in the beginning of the singly link list
    /*
    1.create new node
    2.assign head next of new Node
    3.head always pointing to first node.
     */

    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    //insert node at the end of singly link list
   /*
   1. create new node
   2.check head is null
      if null then new node assign to head.
   3.traverse the node
      create one current pointer witch is pointing to head
   4. then going current=current.next
   5. current.next=newNode
    */
    public void insertEnd(int data) {
        ListNode newNode = new ListNode(data);
        //list is empty
        if (head == null) {
            head = newNode;
            return;
        }
        //list is not empty
        ListNode current = head;
        while (null != current.next) {
            //reached the last of the list
            current = current.next;
        }
        current.next = newNode;
    }

    //insert the node in given position
    public void insertPosition(int data, int position) {

        ListNode node = new ListNode(data);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    //Delete node from first
    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    //delete node from the last position
    public ListNode deleteEnd() {
        //if head is null or head.next is null
        if (head == null || head.next == null) {
            return head;
        }
        //if head is not null
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    //delete node from given position
    public void deleteNodeFromPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            int count = 1;
            ListNode previous = head;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }

    }

    //search key from link list
    public boolean searchKey(ListNode head, int searchKey) {
        //2-->5-->7-->1-->10-->null
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //reverse the singly link list
    public ListNode reverse(ListNode head) {
        //1-->3-->6-->5-->null
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        if (head == null) {
            return head;
        }
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    //find middle of the node
    public ListNode findMiddle(ListNode head) {
        //10-->1-->3-->6-->11-->null
        if (head == null) {
            return null;
        }
        ListNode slowPrt = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPrt = slowPrt.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPrt;
    }

    //find nth node from the end
    public ListNode getNthNodeFromEnd(ListNode head, int position) {
        //10-->1-->3-->6-->11-->null, po=3
        if (null == head) {
            return null;
        }
        if (position <= 0) {
            throw new IllegalArgumentException("Invalid Value n: " + position);
        }

        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        //move rfe until position count
        while (count < position) {
            refPtr = refPtr.next;
            count++;
        }
        //move both at a time one one
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    //remove duplicate node from sorted link list
    public void removeDuplicate(ListNode head) {
        if (head == null) {
            return;
        }

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    //insert node in sorted link list
    public ListNode insertInSortedNode(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    //remove key from given link list
    public void removeKey(ListNode head, int key) {
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        temp.next = current.next;
    }

    //check the link list contains loop
    public boolean isLoop(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                return true;
            }
        }
        return false;
    }

    //Find the starting pointer of the loop
    public ListNode startNodeInLoop(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                return getStartingPintInNode(head, slowPtr);
            }
        }
        return null;
    }

    //detect starting of the link list
    private ListNode getStartingPintInNode(ListNode head, ListNode slowPtr) {
        ListNode temp = head;
        while (slowPtr != temp) {
            slowPtr = slowPtr.next;
            temp = temp.next;
        }
        return temp;
    }

    //remove loop from link list
    public void removeLoopFromLinkList(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (fastPtr == slowPtr) {
                removeLoop(head, slowPtr);
            }
        }
    }

    //Remove loop from link list
    private void removeLoop(ListNode head, ListNode slowPtr) {

        ListNode temp = head;
        while (slowPtr.next != temp.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }
        slowPtr.next = null;
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

        SinglyLinklist sl = new SinglyLinklist();

        /*
        boolean searchKey = sl.searchKey(head, 1);
        if (searchKey) {
            System.out.println("search key found !!!");
        } else {
            System.out.println("search key not found !!");
        }
        */

        /*
        ListNode listNode = sl.reverse(head);
        sl.printNode(listNode);
        */

        /*
        ListNode middle = sl.findMiddle(head);
        System.out.println("Middle node is : "+middle.data);
        */

        /*
        ListNode nthNodeFromEnd = sl.getNthNodeFromEnd(head, 3);
        System.out.println("Nth node from the end is : "+nthNodeFromEnd.data);
        */

        /*
        sl.removeDuplicate(head);
        sl.printNode(head);
        */

        /*ListNode listNode = sl.insertInSortedNode(head,2);
        sl.printNode(listNode);*/

       /*
       sl.printNode(head);
        System.out.println();
        sl.removeKey(head,3);
        sl.printNode(head);
        */

        /*
        boolean slLoop = sl.isLoop(head);
        if(slLoop)
            System.out.println("This link list contain a loop");
        else
        System.out.println("This link list not contain a loop");
        */

        /*
        ListNode node = sl.startNodeInLoop(head);
        System.out.println(node.data);
        */

        //sl.removeLoopFromLinkList(head);
        sl.printNode(head);
    }
}
