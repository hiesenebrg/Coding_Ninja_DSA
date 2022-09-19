// package Graphs;
import java.util.*;

public class BFS {
    public  static void bfshealper(int [][] adjMatrix , int sv, boolean[] isVisited){
        Queue<Integer> pendingnodes = new LinkedList<>();
        pendingnodes.add(sv);
        isVisited[sv] = true;
        while(!pendingnodes.isEmpty()){
            int v = pendingnodes.peek();
            System.out.print(v + " ");
            pendingnodes.poll();
            for (int i = 0; i < adjMatrix.length; i++) {
                if(adjMatrix[v][i]>0 && !isVisited[i]){
                    pendingnodes.add(i);
                    isVisited[i] = true;
                }
            }
        }
    }
    public static void bfs(int[][] adjMatrix  ){
        int sv = 0;
        boolean[] isVisited = new boolean[adjMatrix.length];
        bfshealper(adjMatrix , sv, isVisited);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int [][] adjMatrix = new int[v][v];
        for (int i = 0; i < e; i++) {
            System.out.println("Enter the vertices of the " + i + "th" + "edge");
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        bfs(adjMatrix);
}
}
