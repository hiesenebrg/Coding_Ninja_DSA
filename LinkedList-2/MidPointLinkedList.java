
import java.util.Scanner;

public class MidPointLinkedList {

  public static Node<Integer> takeInput() {
    Scanner s = new Scanner(System.in);
    int data = s.nextInt();
    Node<Integer> head = null;
    while (data != -1) {
      Node<Integer> currentNode = new Node<integer>(data);
      if (head == null) {
        head = currentNode;
        tail = currentNode;
      } else {
        // Node<Integer> tail = head;
        // while(tail.next!==null){
        // tail= tail.next;
        // }
        // tail.next= currentNode;
        // }
        // data=s.nextInt();
        tail.next = currentNode;
        tail = currentNode; // tail=tail.next;
      }
      data = s.nextInt();
    }
  }

  public static void printR(Node<Integer> head) {
    if (head == null) {
      return;
    }
    printR(head.next);
    System.out.print(head.data + " ");
  }

  public static Node<Integer> midpoint(Node<Integer> head) {
    Node<Integer> slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  public static void main(String[] args) {

    Node<Integer> head = takeInput();
    Node<Integer> mid = midpoint(head);
    System.out.println(mid.data);

    // Node<Integer> n1= new Node<>(10);
    // System.out.println(length(head));

  }
}
