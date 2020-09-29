package com.company.stacks;

public class StacksImplementation {
    public static void main(String[] args) {

        Stacks stack = new Stacks();

        stack.push("13");
        stack.push("40");
        stack.push("10");
        stack.push("33");
        System.out.println("peeked from stack " + stack.peek() + " from top of stack");
        stack.printElements();

        System.out.println("popped item " + stack.pop() + " from top of stack");

        stack.printElements();

        System.out.println("peeked from stack " + stack.peek() + " from top of stack");

        stack.printElements();
    }
}
