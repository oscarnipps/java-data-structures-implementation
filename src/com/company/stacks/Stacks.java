package com.company.stacks;

public class Stacks {

    private Node head;

    //the push operation inserts a node at the head of the linked list in constant time / O(1)
    public void push(String data) {

        //insert at the head since the stack is empty
        if (head == null) {
            head = new Node(data);
            return;
        }

        //create new node and set it's next to the current head
        Node newNode = new Node(data);

        //pointer to the existing head node
        newNode.next = head;

        //assign the newly created node as the head
        head = newNode;
    }

    //the push operation removes a node from the head of the linked list in constant time / O(1)
    public String pop() {
        //return null since stack is empty
        if (head == null) {
           return null;
        }
        //move pointer to next node
        Node currentNode = head.next;

        //delete the head node
        head.next = null;

        //get the data of the deleted node
        String data = head.data;

        //assign the current node as the head
        head = currentNode;

        return data;
    }

    public String peek() {
        if (head == null){
            return "empty stack";
        }
        return head.data;
    }

    public void printElements() {
        if (head == null) {
            System.out.println("stack is empty");
            return;
        }

        //never modify the head node directly
        Node currentNode = head;

        while (currentNode.next != null) {
            System.out.println("| " + currentNode.data + " |");
            currentNode = currentNode.next;
        }
        System.out.println("| " + currentNode.data + " |");
    }
}
