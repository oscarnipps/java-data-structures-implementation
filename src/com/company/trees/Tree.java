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
    public void preOrderTransversal(){
        //since in order transversal is a depth first transversal a stack would be needed
        Stack<TreeNode> nodeStack = new Stack<>();

        //would hold the distinctively visited nodes
        Set<TreeNode> visitedSet = new HashSet<>();

        TreeNode currentNode = root;
        nodeStack.push(null);
        nodeStack.push(currentNode);

        while (!nodeStack.isEmpty() ) {
            //visit the node
            if (!visitedSet.contains(currentNode)) {
                System.out.print(" " + currentNode.data + " ");
                visitedSet.add(currentNode);
            }

            if (currentNode.leftChild != null && !visitedSet.contains(currentNode.leftChild)) {
                currentNode = currentNode.leftChild;
                nodeStack.push(currentNode);
                continue;
            }

            if (currentNode.rightChild != null && !visitedSet.contains(currentNode.rightChild)) {
                currentNode = currentNode.rightChild;
                nodeStack.push(currentNode);
                continue;
            }

            currentNode = nodeStack.pop();
        }
    }

    public void inOrderTransversal() {
        //since in order transversal is a depth first transversal a stack would be needed
        Stack<TreeNode> nodeStack = new Stack<>();

        //would hold the distinctively visited nodes
        Set<TreeNode> visitedSet = new HashSet<>();

        TreeNode currentNode = root;

        nodeStack.push(currentNode);

        while (!nodeStack.isEmpty()) {
            //move to the not null left child that has not being visited and push the node to the stack
            if (currentNode.leftChild != null && !visitedSet.contains(currentNode.leftChild)) {
                currentNode = currentNode.leftChild;
                nodeStack.push(currentNode);
                continue;
            }
            //add the node to the visited set holding uniquely visited nodes
            visitedSet.add(currentNode);

            //visit the node / or any other operation (print the data)
            System.out.print(" " + currentNode.data + " ");

            //remove visited node from the stack
            nodeStack.pop();

            //move to the not null right child that has not being visited and push the node to the stack
            if (currentNode.rightChild != null && !visitedSet.contains(currentNode.rightChild)) {
                currentNode = currentNode.rightChild;
                nodeStack.push(currentNode);
                continue;
            }

            if (nodeStack.isEmpty()) break;

            //move to the node at the top of the stack
            currentNode = nodeStack.peek();
        }
    }

    public void postOrderTransversal() {
        //since in order transversal is a depth first transversal a stack would be needed
        Stack<TreeNode> nodeStack = new Stack<>();

        //would hold the distinctively visited nodes
        Set<TreeNode> visitedSet = new HashSet<>();

        TreeNode currentNode = root;
        nodeStack.push(null);
        nodeStack.push(currentNode);

        while(!nodeStack.isEmpty()){
            if (currentNode == null) {
                break;
            }

            if (!visitedSet.contains(currentNode)) {
                nodeStack.push(currentNode);
            }

            if (currentNode.leftChild != null && !visitedSet.contains(currentNode.leftChild) ) {
                currentNode = currentNode.leftChild;
                continue;
            }

            if (currentNode.rightChild != null && !visitedSet.contains(currentNode.rightChild)  ) {
                currentNode = currentNode.rightChild;
                continue;
            }

            //add the node to the visited set or do any kind of work, here work is done in printing
            if (!visitedSet.contains(currentNode)) {
                visitedSet.add(currentNode);
                System.out.print(" " + currentNode.data + " ");
            }

            currentNode = nodeStack.pop();
        }
    }

    public void levelOrderTransversal() {
        //since level order transversal is a breadth first transversal a queue would be needed
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            //remove from the front of the queue
            TreeNode currentNode = queue.poll();

            //skip null nodes added to the queue
            if (currentNode == null) {
                continue;
            }

            //add the node to the visited set or do any kind of work, here work is done in printing
            System.out.print(" " + currentNode.data + " ");

            //add the left non-null child to the queue
            queue.add(currentNode.leftChild);

            //add the right non-null child to the queue
             queue.add(currentNode.rightChild);
        }
    }

}
