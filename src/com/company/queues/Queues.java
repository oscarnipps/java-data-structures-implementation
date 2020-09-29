package com.company.queues;

public class Queues {
    Node head;

    //since queue is FIFO (first in first out) then enqueue is done
    //at the end in O(n) time complexity
    public void enqueue(String data) {

    }

    //since queue is FIFO (first in first out) then dequeue is done
    //at the front in O(1) since the first item inserted is the item
    //to be removed
    public void dequeue(String data) {

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
