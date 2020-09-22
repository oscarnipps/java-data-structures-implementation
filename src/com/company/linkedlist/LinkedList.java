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
        //start from the head
        Node currentNode = head;
        //new node to insert
        Node newNode = new Node(data);
        //insert at head if the position is equal to 0 which denotes the head
        if (position == 0) {
            newNode.setNext(currentNode);
            head = newNode;
            return;
        }
        int count = 0;
        while (currentNode.getNext() != null) {
            //break if the position to be inserted is found
            if (count == position - 1 ) {
                break;
            }
            //move to the next node and increment the count
            currentNode = currentNode.getNext();
            count++;
        }
        //make the new node point to the next node of the current
        newNode.setNext(currentNode.getNext());
        //set the new node as the current's next node
        currentNode.setNext(newNode);
    }

    public void reverseLinkedList() {
        Node reversed = null;
        Node currentNode = head;

        while (head != null) {
            //move the head to the next node
            head = head.getNext();
            currentNode.setNext(reversed);
            reversed = currentNode;
            currentNode = head;
        }
        displayList(reversed);
    }

    public void displayList(Node node) {
        if (node == null) {
            System.out.print(" list is empty ");
            return; //list is empty
        }
        Node current = node;
        while (current.getNext() != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.print(current.getData() + " -> " + current.getNext() + "\n");
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

        System.out.print(current.getData() + " -> " + current.getNext() + "\n");
    }

}
