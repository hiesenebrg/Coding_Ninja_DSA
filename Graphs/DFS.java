// package Graphs;
import java.util.Scanner;;
public class DFS {
    public static void dfshealper(int sv , int[][] adjMatrix , boolean[] isVisited){
            System.out.print(sv + " ");
            isVisited[sv] = true;
            for (int i = 0; i < adjMatrix.length; i++) {
                if(adjMatrix[sv][i]>0 && !isVisited[i]){
                    dfshealper(i, adjMatrix, isVisited);
                }
            }
    }
    public static void dfs(int[][] adjMatrix){
        int sv = 0;
        boolean[] isVisited = new boolean[adjMatrix.length];
        dfshealper(sv , adjMatrix , isVisited);
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
        dfs(adjMatrix);
}
}
