package dsa;

import java.util.logging.Logger;

class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26]; // Assuming only lowercase a-z
        isEnd = false;
    }
}

public class Trie {

private TrieNode root;

public Trie() {
    root = new TrieNode();
}


public void insert(String word) {
    TrieNode node = root;
    for (char ch : word.toCharArray()) {
        int index = ch - 'a';
        if (node.children[index] == null) {
            node.children[index] = new TrieNode();
        }
        node = node.children[index];
    }
    node.isEnd = true;
}


public boolean search(String word) {
    TrieNode node = root;
    for (char ch : word.toCharArray()) {
        int index = ch - 'a';
        if (node.children[index] == null) {
            return false;
        }
        node = node.children[index];
    }
    return node.isEnd;
}

public boolean startsWith(String prefix) {
    TrieNode node = root;
    for (char ch : prefix.toCharArray()) {
        int index = ch - 'a';
        if (node.children[index] == null) {
            return false;
        }
        node = node.children[index];
    }
    return true;
}



public static void main(String[] args) {
    Logger log = Logger.getLogger(Trie.class.getName());
    // Create a new Trie
    Trie trie = new Trie();

    // Insert words into the Trie
    trie.insert("hello");
    trie.insert("hi");
    trie.insert("helicopter");

    // Search for words in the Trie
    log.info("trie.search(\"hello\") " + trie.search("hello")); // true
    System.out.println(trie.search("hi")); // true
    System.out.println(trie.search("helicopter")); // true
    System.out.println(trie.search("hey")); // false

    // Check for prefixes in the Trie
    System.out.println(trie.startsWith("he")); // true
    System.out.println(trie.startsWith("h")); // true
    System.out.println(trie.startsWith("ho")); // false
}
}