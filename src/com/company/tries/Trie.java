package com.company.tries;

public class Trie {
    private Node root;

    public Trie() {
        this.root = new Node(" ");
    }

    public void insert(String word) {
        Node currentNode = root;

        for (char currentCharacter : word.toCharArray()) {
            //get the index representation of the current character by subtracting the base character 'a' from any seen character in the word
            //so index of character 'a' is 0 ( 'a' - 'a' where ascii for 'a' is 65 ) ,'b' is 1 ( 'b' - 'a' where ascii for 'b' is 66 ) e.t.c
            int charIndex = currentCharacter - 'a';

            //if char does not exists as a child then add a new node as a child to that node
            if (currentNode.children[charIndex] == null) {

                //set child node as a current child of that node
                currentNode.setChild(charIndex, new Node(Character.toString(currentCharacter)));

                //move to the newly added node
                currentNode = currentNode.getChild(charIndex);

                continue;
            }
            //move to the node
            currentNode = currentNode.getChild(charIndex);
        }

        //all the characters have been inserted to the trie which denotes a word has been added
        currentNode.isWord = true;
    }

}

