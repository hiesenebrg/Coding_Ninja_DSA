import java.util.LinkedList;

public class LinkedListinColllection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 100);
        list.addFirst(80);
        list.set(0, 60);
        list.remove();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
