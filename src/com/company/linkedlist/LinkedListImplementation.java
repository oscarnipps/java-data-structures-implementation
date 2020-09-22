package com.company.linkedlist;

public class LinkedListImplementation {

    public static void main(String args[]) {
        LinkedList linkedList = new LinkedList();
        System.out.println("given reversed linked list:");
        linkedList.insertAtEnd(3);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(6);
        linkedList.insertAtEnd(11);
        linkedList.insertAtEnd(100);
        linkedList.traverseList();

        System.out.println("reversed linked list:");
        linkedList.reverseLinkedList();
    }
}
