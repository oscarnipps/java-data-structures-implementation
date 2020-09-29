package com.company.linkedlist;

public class LinkedListImplementation {

    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        System.out.println("given linked list:");
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(11);
        linkedList.insertAtEnd(100);

        linkedList.traverseList();

        //System.out.println("reversed linked list:");
        //linkedList.reverseLinkedList();

        //System.out.println("\ndelete from front of linked list:");
        //linkedList.deleteAtFront();
        //linkedList.traverseList();

        //System.out.println("\ndelete from end of linked list:");
        //linkedList.deleteAtEnd();
        //linkedList.traverseList();

        //int position = 9;
        //System.out.println("\ndelete at position "  + position + " of linked list:");
        //linkedList.deleteAtPosition(position);
        //linkedList.traverseList();
    }
}
