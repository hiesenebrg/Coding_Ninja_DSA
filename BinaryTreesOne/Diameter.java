// package BinaryTreesOne;

import java.util.*;

public class Diameter {

    public static BinaryTreeNode<Integer> inputLevel() {
        System.out.println("Enter the root data");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        Queue<BinaryTreeNode<Integer>> pendingnodes = new LinkedList<BinaryTreeNode<Integer>>();
        pendingnodes.add(root);
        while (!pendingnodes.isEmpty()) {
            BinaryTreeNode<Integer> firstdata = pendingnodes.poll();
            System.out.println("Enter the left data for" + firstdata.data);
            int leftdata = sc.nextInt();
            if (leftdata == -1) {
                root.left = null;
            } else {
                BinaryTreeNode<Integer> left = new BinaryTreeNode<>(leftdata);
                root.left = left;
                pendingnodes.add(left);
            }
            System.out.println("Enter the right data for" + firstdata.data);
            int rightdata = sc.nextInt();
            if (rightdata == -1) {
                root.right = null;
            } else {
                BinaryTreeNode<Integer> right = new BinaryTreeNode<>(rightdata);
                root.right = right;
                pendingnodes.add(right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        inputLevel();
    }
}
