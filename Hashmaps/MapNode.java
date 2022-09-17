// package Hashmaps;
public class MapNode<K,V>{
    public K Key;
    public V Value;
    public  MapNode<K,V> next;
    public MapNode(K Key , V value){
        this.Key = Key;
        this.Value = Value;
    }
}