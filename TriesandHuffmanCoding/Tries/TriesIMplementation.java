// package TriesandHuffmanCoding.Tries;

public class TriesIMplementation {
    private TrieNode root;
    // this is the constructor
    public TriesIMplementation(){
         root   = new TrieNode('\0');
    }
    // this function act as a search helper function
    public boolean searchHelper(TrieNode root ,  String word){
        if(word.length() ==0){
            if(root.isTerminal){
                return true;
            }else{
                return false;
            }
        }
        int childIndex = word.charAt(0)-'A';
        
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        return searchHelper(child, word.substring(1));
    }
    // this function is for searching the word in the Tries
    public boolean search(String word){

        return searchHelper(root, word);
    }
    // this is the insert helper function
    public void addhelper(TrieNode root , String word){
        if(word.length()==0){
            root.isTerminal = true;
            return ;
        }
         
         int  index = word.charAt(0) - 'A';
         
        TrieNode child = root.children[index];
        if(child == null){
            child =  new TrieNode(word.charAt(0));
            root.children[index] = child;
            }
        addhelper(child, word.substring(1));;
    }
    public void add(String word){
        addhelper(root ,  word);
    }
    // this is the rooot helper function that helps in removing the word
    public void removeHelper(TrieNode root , String word){
        if(word.length() == 0){
            root.isTerminal = false;
            return;
        }
        int index = word.charAt(0)- 'A';
        TrieNode child = root.children[index];
        if(child == null){
            return ;
        }
        removeHelper(child, word.substring(1));
    }
    //  this is remove function usesd to remove the word from the tries
    public void remove(String word){
        removeHelper(root, word);
    }
}
