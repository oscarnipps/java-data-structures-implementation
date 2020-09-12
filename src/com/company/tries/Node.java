package com.company.tries;

import java.util.Arrays;
import java.util.Objects;

/*
 *  a single node item for a trie
 *
 *  created by oscar 10/09/2020
 */
public class Node {
    //no need to store this char because the position already defines what char it represents
    public String character;
    public boolean isWord;
    public Node[] children;

    public Node(String character) {
        this.character = character;
        this.isWord = false;
        this.children = new Node[26];
    }

    public void setChild(int index, Node node) {
        this.children[index] = node;
    }

    public Node getChild(int index) {
        return this.children[index];
    }

    //checks if the character exists as a child of the node
    public boolean isChild(char character, Node node) {
        int charIndex = character - 'a';
        return node.children[charIndex] == null;
    }


    @Override
    public String toString() {
        return "Node{" +
                "character='" + character + '\'' +
                ", isWord=" + isWord +
                ", children=" + Arrays.toString(children) +
                '}';
    }

}
