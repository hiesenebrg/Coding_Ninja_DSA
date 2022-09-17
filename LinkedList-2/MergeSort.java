import java.util.LinkedList;

public class MergeSort {

    public static LinkedList<Integer> midpoint(LinkedList<Integer> head) {
        LinkedList<Integer> slow = head;
        LinkedList<Integer> fast = head;
        int count = 1;
        // for even linkedList stoping conditon is fast.next==null
        // for odd linkedlist the stoping condition is fast.next.next == null
        while (fast.next != null && fast.next.next != null) {
            count += 1;
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static LinkedList<Integer> mergeSort(LinkedList<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null) {
            return head;
        }
        LinkedList<Integer> mid_point = midpoint(head);
        LinkedList<Integer> head2 = mid_point.next;
        mid_point.next = null;
        LinkedList<Integer> first = mergeSort(head);
        LinkedList<Integer> second = mergeSort(head2);
        return MergeTwoSLL(first, second);
    }

    public static LinkedList<Integer> MergeTwoSLL(LinkedList<Integer> head1, LinkedListNode<Integer> head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        LinkedList<Integer> t1 = head1, t2 = head2;
        LinkedList<Integer> head = null, tail = null;
        while (t1 != null && t2 != null) {
            if (t1.data <= t2.data) {
                if (head == null) {
                    head = t1;
                    tail = t1;
                } else {
                    tail.next = t1;
                    tail = t1;

                }
                t1 = t1.next;
            } else {
                if (head == null) {
                    head = t2;
                    tail = t2;
                } else {
                    tail.next = t2;
                    tail = t2;
                }
                t2 = t2.next;
            }
        }
        if (t1 != null) {
            tail.next = t1;
        } else {
            tail.next = t2;
        }
        return head;

    }

}
