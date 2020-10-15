package com.company.queues;

public class Queues {
    Node front;
    Node rear;

    //since queue is FIFO (first in first out) then enqueue is done at the end in O(1) constant time complexity
    public void enqueue(String data) {
        if (front == null) {
            Node newNode = new Node(data);
            rear = newNode;
            front = newNode;
            return;
        }
        Node newNode = new Node(data);
        rear.next = newNode;
        rear = rear.next;
    }

    //since queue is FIFO (first in first out) then dequeue is done at the front in O(1) constant time complexity
    //since the first item inserted is the item to be removed
    public void dequeue() {

        //return if the queue is empty
        if (front == null) {
            System.out.println("queue is empty");
            return;
        }

        //delete the last item in the queue since it is the only
        //item existing in the queue
        if (front.next == null && rear.next == null) {
            front = null;
            rear = null;
            return;
        }
        //delete the node at the front and move the front pointer to the next node
        Node tempNode = front.next;
        front.next = null;
        front = tempNode;
    }

    public void printElements() {
        if (front == null) {
            System.out.println("stack is empty");
            return;
        }

        //never modify the head node directly
        Node currentNode = front;
        
        while (currentNode.next != null) {
            System.out.print("| " + currentNode.data + " |");
            currentNode = currentNode.next;
        }
        System.out.println("| " + currentNode.data + " |");
    }

}
