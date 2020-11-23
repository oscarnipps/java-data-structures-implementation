package com.company.trees;

import java.util.Objects;

public class TreeNode {
    int data;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return data == treeNode.data &&
                Objects.equals(leftChild, treeNode.leftChild) &&
                Objects.equals(rightChild, treeNode.rightChild);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, leftChild, rightChild);
    }
}
