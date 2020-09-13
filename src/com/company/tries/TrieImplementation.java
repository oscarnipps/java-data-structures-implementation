package com.company.tries;

public class TrieImplementation {

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("flower");
        trie.insert("flow");
        trie.insert("flight");

        System.out.println("longest common prefix is : " + trie.longestCommonPrefix());
    }
}
