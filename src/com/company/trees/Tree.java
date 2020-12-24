package com.company.trees;

import java.util.*;

public class Tree {
    TreeNode root;

    public void insertNode(int data) {
        //insert at the root if root is empty
        if (root == null) {
            root = new TreeNode(data);
            return;
        }

        //node to be inserted with right and left child as null
        TreeNode newNode = new TreeNode(data);

        TreeNode currentParent = root;

        while (currentParent != null) {
            //parent should be greater than left and smaller than right
            if (currentParent.data >= data) {

                //for a leaf node , add the new node at the point
                if (currentParent.leftChild == null) {
                    currentParent.leftChild = newNode;
                    break;
                }

                //move to the inserted node
                currentParent = currentParent.leftChild;

            } else {
                //for a leaf node , add the new node at the point
                if (currentParent.rightChild == null) {
                    currentParent.rightChild = newNode;
                    break;
                }
                //move to the inserted node
                currentParent = currentParent.rightChild;
            }
        }
    }

    public void searchItem(int item) {
    }

    //the policy for pre-order is N-L-R (visit the parent first, then the left child and then the right child)
    //for every node in the tree
    public void preOrderIterative() {

        //since pre-order transversal is a depth first transversal a stack would be needed
        Stack<TreeNode> nodeStack = new Stack<>();

        nodeStack.push(root);

        while (!nodeStack.isEmpty()) {

            TreeNode currentNode = nodeStack.pop();

            //visit the node / or any other operation (i.e here just print the data)
            System.out.print(" " + currentNode.data + " ");

            //push non-null right child to the stack
            if (currentNode.rightChild != null) nodeStack.push(currentNode.rightChild);

            //push non-null left  child to the stack
            if (currentNode.leftChild != null) nodeStack.push(currentNode.leftChild);
        }
    }

    public void preOrderRecursive(TreeNode node) {
        //base case
        if (node == null) return;

        //visit the node / or any other operation (print the data)
        System.out.print(" " + node.data + " ");

        preOrderRecursive(node.leftChild);

        preOrderRecursive(node.rightChild);
    }


    //the policy for in-order is L-N-R (go to left node i.e as far left as possible, move to the parent node, then the right node)
    //for every node in the tree
    public void inOrderIterative() {
        //since in order transversal is a depth first transversal a stack would be needed
        Stack<TreeNode> nodeStack = new Stack<>();

        TreeNode currentNode = root;

        while(!nodeStack.isEmpty() || currentNode != null){

            //keep going to the far left as possible (i.e till a null left node is reached)
            while (currentNode != null) {
                nodeStack.push(currentNode);
                currentNode = currentNode.leftChild;
            }

            currentNode = nodeStack.pop();

            System.out.print(" " + currentNode.data + " ");

            currentNode = currentNode.rightChild;
        }

    }

    public void inOrderRecursive(TreeNode node) {
        if (node == null) return;

        //go to left sub tree
        inOrderRecursive(node.leftChild);

        //visit the node / or any other operation (print the data)
        System.out.print(" " + node.data + " ");

        //go to right sub tree
        inOrderRecursive(node.rightChild);
    }

    public void postOrderRecursive(TreeNode node) {
        if (node == null) return;

        //go to left sub tree
        postOrderRecursive(node.leftChild);

        //go to right sub tree
        postOrderRecursive(node.rightChild);

        //visit the node / or any other operation (print the data)
        System.out.print(" " + node.data + " ");
    }

    //the policy for post-order is L-R-N (go to left node ,then right node before visiting the parent node)
    //for every node in the tree
    public void postOrderIterative() {
        Stack<TreeNode> tempStack = new Stack<>();

        Stack<TreeNode> resultStack = new Stack<>();

        tempStack.push(root);

        while(!tempStack.isEmpty()){

            TreeNode current = tempStack.pop();

            resultStack.push(current);

            if(current.leftChild != null) tempStack.push(current.leftChild);

            if(current.rightChild != null) tempStack.push(current.rightChild);
        }

        //print elements from the result stack
        while(!resultStack.isEmpty()){
            //visit the node / or any other operation (print the data)
            System.out.print(" " + resultStack.pop().data + " ");
        }
    }

    public void levelOrderTransversal() {
        //since level order transversal is a breadth first transversal a queue would be needed
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            //remove from the front of the queue
            TreeNode current = queue.poll();

            //add the node to the visited set or do any kind of work, here work is done in printing
            System.out.print(" " + current.data + " ");

            //add the left non-null child to the queue
            if (current.leftChild != null) queue.add(current.leftChild);

            //add the right non-null child to the queue
            if (current.rightChild != null) queue.add(current.rightChild);

        }
    }

}
