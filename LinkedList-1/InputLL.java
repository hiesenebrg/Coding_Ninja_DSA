
// package LinkedList-1;
import java.util.Scanner;

public class InputLL {

  public static   Node<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        while(data != -1){
          Node<Integer> currentNode= new Node<integer>(data);
          if(head==null){
            head=currentNode;
          }else{
            Node<Integer> tail = head;
            while(tail.next!=null){
                tail= tail.next;
            }
            tail.next= currentNode;
          }
          data=s.nextInt();
    }

  public static void print(Node<Integer> head) {

    Node<Integer> temp = head;
    while (head != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  public static void main(String[] args) {

    Node<Integer> head = createLinkedList();
    print(head);
    // Node<Integer> n1= new Node<>(10);
    // System.out.println(length(head));

  }
}
