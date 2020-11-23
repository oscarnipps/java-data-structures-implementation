package com.company.trees;

public class TreeImplementation {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insertNode(11);
        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(19);
        tree.insertNode(4);
        tree.insertNode(10);
        tree.insertNode(5);
        tree.insertNode(17);
        tree.insertNode(40);

        System.out.print("in-order transversal : ");
        tree.inOrderTransversal();

        System.out.print("\npre-order transversal : ");
        tree.preOrderTransversal();

        System.out.print("\nlevel-order transversal : ");
        tree.levelOrderTransversal();

        System.out.print("\npost-order transversal : ");
        tree.postOrderTransversal();
    }
}
