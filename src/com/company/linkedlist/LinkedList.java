package com.company.linkedlist;

public class LinkedList {

    private Node head;

    public void insertAtFirst(int data) {
        if (head == null) {
            Node newNode = new Node(data);
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void insertAtEnd(int data) {
        //create and insert the newly created node at the head if the linked list is empty
        if (head == null) {
            Node newNode = new Node(data);
            head = newNode;
            return;
        }
        //start from the head of the list
        Node currentNode = head;
        //get to the last node i.e node that has the null reference as the next node
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        //since the last node has being reached (i.e node with null value for the next node)
        //then create new node with the corresponding data and update the current node's reference
        //to the new node
        Node newNode = new Node(data);
        currentNode.setNext(newNode);
    }

    public void insertAtPosition(int data, int position) {

    }

    public void traverseList() {
        if (head == null) {
            System.out.print(" list is empty ");
            return; //list is empty
        }

        Node current = head;
        while (current.getNext() != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }

        System.out.print(current.getData() + " -> " + current.getNext());
    }

}
