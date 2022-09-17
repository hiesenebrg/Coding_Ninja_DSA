// package TriesandHuffmanCoding.Tries;



public class TriesUse {
    public static void main(String[] args) {
        TriesIMplementation tries =  new TriesIMplementation();
        tries.add("ADD");
        // tries.add("ADARSH");
        
        
        System.out.println(tries.search("ADD"));
        tries.remove("ADD");
        System.out.println(tries.search("ADD"));
    }
    
}
