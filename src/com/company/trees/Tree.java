package com.company.trees;

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
                    System.out.println("insert new node at left");
                    currentParent.leftChild = newNode;
                    break;
                }

                System.out.println("insert node at left of parent ::::::: " + currentParent.data);
                //move to the inserted node
                currentParent = currentParent.leftChild;
            } else {
                //for a leaf node , add the new node at the point
                if (currentParent.rightChild == null) {
                    System.out.println("insert new node at right");
                    currentParent.rightChild = newNode;
                    break;
                }

                System.out.println("insert node at right of parent :::::: " + currentParent.data);
                //move to the inserted node
                currentParent = currentParent.rightChild;
            }
        }
        System.out.println("data at last node : " + currentParent.data);
        System.out.println("data at last node right: " + (currentParent.rightChild == null ? "null" :currentParent.rightChild.data));
        System.out.println("data at last node left: " + (currentParent.leftChild == null ? "null" :currentParent.leftChild.data));
    }

    public void searchItem(int item) {
    }

    public void printItems() {

    }
}
