package PriorityQueues;

import java.util.PriorityQueue;

public class InbuiltPQ{

    public static void main(String[] args){
        int[] arr= {4,3,7,6,9,10,1,2};
        // by default the heap is a min heap 
        // in order to get a max heap multiply each element by -1 
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }
    }
}
