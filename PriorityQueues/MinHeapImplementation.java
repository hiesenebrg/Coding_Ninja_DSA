package PriorityQueues;
import java.util.ArrayList;


public class MinHeapImplementation<T> {
    private ArrayList<Metadata<T>> heap ;
    public MinHeapImplementation(){
            heap = new ArrayList<>();
        }
        // this is for inserting the data in min heap
        public void Insert(T data , int priority){
            Metadata<T> key = new Metadata<>(data ,priority);
            heap.add(key);
            int childindex = heap.size()-1;
            int parentIndex = (childindex-1)/2;
            while(childindex>0){
            if(heap.get(childindex).priority<heap.get(parentIndex).priority){
                Metadata<T> temp = heap.get(childindex);
                heap.set(childindex , heap.get(parentIndex));
                heap.set(parentIndex , temp);
                childindex = parentIndex;
                parentIndex = (childindex-1)/2;
            }else{
                return;
            }
        }
        }
        // this is will give the size of the heap
        public int size(){
            return heap.size();
        }
        // this will tell the heap is empty or full
        public boolean isEmpty(){
            return heap.size() ==0;
        }
        // this will get the minimum value from th emin heap without removing the min element

        public T getMin(){
            return heap.get(0).data;
        }


        // this is for removing the min data from the min heap
        public T removeMin(T data , int priority){
                Metadata<T> first = heap.get(0);
                T ans = first.data;
                heap.set(0, heap.get(heap.size()-1));
                heap.remove(heap.size()-1));
                int parentIndex = 0;
                int rightIndex =( 2*parentIndex)+1;
                int leftIndex = (2*parentIndex)+2;
                while(leftIndex> heap.size()-1){
                    int minIndex =parentIndex;
                    if(heap.get(minIndex).priority>heap.get(leftIndex).priority){
                        minIndex = leftIndex;
                    }
                    if(rightIndex < heap.size() && heap.get(minIndex).priority>heap.get(rightIndex).priority){
                        minIndex = leftIndex;
                    }
                    if(minIndex == parentIndex){
                        break;
                    }
                    parentIndex = minIndex;
                    rightIndex =( 2*parentIndex)+1;
                    leftIndex = (2*parentIndex)+2;

                }
                return ans;
                    
            
            }
}
