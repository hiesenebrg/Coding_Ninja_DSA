//  package Hashmaps;

import java.util.ArrayList;

public class ImplementingHashmaps<K,V> {
    ArrayList<MapNode<K,V>> buckets;
    int count;
    int numBuckets;
    // this is the constructor
    public ImplementingHashmaps(){
         buckets = new ArrayList<>();
         numBuckets = 20;
        for(int i=0; i<buckets.size();i++){
            buckets.add(null);
        }
    }
    // this function is for gettig the index using hashcode
    public int getBucketIndex(K Key){
        int hashcode = Key.hashCode();
        int index = hashcode%20;
        return index;
    }
    // this is the insert function
        public void Insert( K Key , V Value){
                int index = getBucketIndex(Key);
                MapNode<K,V> head =  buckets.get(index);
                // if the key is already present
                while(head!=null){
                    if(head.Key.equals(Key)){
                            head.Value = Value;
                            return;
                    }
                    head = head.next;
                }
                // this line is written after traversing at the end of the linkedlist we have to come back to the index
                head = buckets.get(index);
                // element is not there.insert at 0th position of linked list
                MapNode<K,V> newNode = new MapNode<>( Key,Value);
                newNode.next = head;
                buckets.set(index ,newNode);
                
                return;
        }
    //   for getting the size  
    public int size() { 
        return count;
    }
    // this is for removing any key from the hashmap
    public V removeKey(K Key ){
        int index = getBucketIndex(Key);
        MapNode<K,V>  prev = null ;
        MapNode<K,V> head = buckets.get(index);
        while(head!=null){
            if(head.Key.equals(Key)){
                // it means that the key is found somewhere in the LinkedList
                if(prev!=null){
                    prev.next = head.next;
                    return head.Value;    
                }
                // this means the key is fount at the very beggining of the Linkedlist
                else{
                    buckets.set(index, head.next);
                    return head.Value;                    
                }               
            }
            prev = head;
            head= head.next;
        }
        return null;               
            }

            // this is for getting the  value of a asked key
            public V getValue(K Key){
                int index = getBucketIndex(Key);
                MapNode<K,V> head =  buckets.get(index);
                // if the key is already present
                while(head!=null){
                    if(head.Key.equals(Key)){
                            return head.Value;
                    }
                    head = head.next;
                }
                // this line is written after traversing at the end of the linkedlist we have to come back to the index
                
                
                return null;
            }

            
            public static void main(String[] args) {
                // remember load factor  = n/bucketsize
            }
        }

     

    
