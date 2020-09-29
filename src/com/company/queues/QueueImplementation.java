package com.company.queues;

public class QueueImplementation {
    public static void main(String[] args) {
        Queues queues = new Queues();
        queues.enqueue("3");
        queues.enqueue("8");
        queues.enqueue("11");
        queues.enqueue("2");
        queues.printElements();

        System.out.println("\ndeque / remove from front");
        queues.dequeue();
        queues.printElements();

        System.out.println("\nenqueue / insert from rear");
        queues.enqueue("27");
        queues.printElements();



    }
}
