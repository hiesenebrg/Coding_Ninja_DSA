package PriorityQueues;


import java.util.*;

/**
 * BuyTicket
 */
import java.util.PriorityQueue;
import java.util.Queue;
public class BuyTicket {
    public static int buyTicket(int input[], int k) {
        Queue<Integer> q = new LinkedList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, Collections.reverseOrder());

    for(int i : input){
            q.add(i);
            pq.add(i);
    }
    int count = 0;
    while(!pq.isEmpty()){
        if(q.peek().equals(pq.peek())){
            if(k==0){
                return count+1;
            }
            count++;
            q.poll();
            pq.poll();
            k-=1;
        }else{
            q.add(q.peek());
            q.poll();
            if(k==0){
                k = q.size()-1;
            }else{
                k-=1;
            }
        }
    }
    return count;
}
}