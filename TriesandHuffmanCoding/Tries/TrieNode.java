// package TriesandHuffmanCoding.Tries;

public class TrieNode {
    char word;
     TrieNode children[];
     boolean isTerminal;
     public TrieNode(char word){
        this.word = word;
        this.isTerminal = false;
        this.children  = new TrieNode[26];
     }
}
