package linkedlist;

public class insertR {

  public static void insert(Node<Integer> head, int elem, int pos) {
    Node<Integer> nodeToBeInserted = new Node<Integer>(elem);

    if (pos == 0) {
      nodeToBeInserted.next = head;
      head = nodeToBeInserted;
    } else {
      int count = 0;
      Node<Integer> prev = head;
      while (count < pos - 1 && prev != null) {
        count++;
        prev = prev.next;
      }
      if (prev != null) {
        nodeToBeInserted.next = prev.next;
        prev.next = nodeToBeInserted;
      }
    }
  }

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

  public static Node<Integer> insertR(Node<Integer> head, int elem, int pos) {
    if (head == null && pos > 0) {
      return head;
    }
    if (pos == 0) {
      Node<Integer> newNode = new Node<>(elem);
      newNode.next = head;
      return newNode;
    } else {
      head.next = insertR(head.next, elem, pos - 1);
      return head;
    }
  }

  public static void main(String[] args) {

    Node<Integer> head = takeInput();
    head = insertR(head, 20, 2);
    printR(head);
    // Node<Integer> n1= new Node<>(10);
    // System.out.println(length(head));

  }
}
