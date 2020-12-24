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

        System.out.print("\npre-order transversal (recursive) : ");
        tree.preOrderRecursive(tree.root);

        System.out.print("\npre-order transversal (iterative) : ");
        tree.preOrderIterative();

        System.out.print("\nin-order transversal (recursive) : ");
        tree.inOrderRecursive(tree.root);

        System.out.print("\nin-order transversal (iterative) : ");
        tree.inOrderIterative();

        System.out.print("\npost-order transversal (recursive) : ");
        tree.postOrderRecursive(tree.root);

        System.out.print("\npost-order transversal (iterative) : ");
        tree.postOrderIterative();

        System.out.print("\nlevel-order transversal : ");
        tree.levelOrderTransversal();
    }
}
