package PriorityQueues;

public class Metadata<T> {
    public T data; 
    public int priority;
    public Metadata(T data , int priority){
        this.data = data;
        this.priority = priority;
    }
}
