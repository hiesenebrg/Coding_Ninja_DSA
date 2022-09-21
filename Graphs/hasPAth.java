/**
 * getPath
 */
import java.util.*;
public class hasPAth {
    public static boolean haspathhelperusingDFS(int[][] adjMatrix, int v1 , int v2 , boolean[] isboolean){
        if(v1==v2){
            return true;
        }
        isboolean[v1] = true;
            for(int i = 0; i<adjMatrix.length;i++){
                    if(adjMatrix[v1][i]>0 && !isboolean[i]){
                        isboolean[i] = true;
                        haspathhelperusingDFS(adjMatrix, i, v2, isboolean);
                       
                        
                    }
            }
            return false;
    }
    public static boolean haspathusingDFS(int[][] adjMatrix, int v1 , int v2){
        boolean[] isboolean = new boolean[adjMatrix.length];
        return haspathhelperusingDFS(adjMatrix, v1 , v2 , isboolean);
    }
    public static boolean haspathusingBFS(int[][] adjMatrix, int v1 , int v2){
        boolean[] isVisited = new boolean[adjMatrix.length];
        
        Queue<Integer> q  = new LinkedList<>();
        q.add(v1);
        isVisited[v1] = true;
        while(!q.isEmpty()){
            int first = q.peek();
            q.poll();
            for (int i = 0; i < adjMatrix.length; i++) {
                if(adjMatrix[first][i]>0 && !isVisited[i]){
                    q.add(i);
                    isVisited[v1] = true;
                    
                    if(i==v2){
                        return true;
                    }
                    
                }
            }
        }
        return false;
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
        System.out.println("Enter the first vertex");
        int v1 = sc.nextInt();
        System.out.println("Enter the second vertex");
        int v2 = sc.nextInt();
        System.out.println(haspathusingBFS(adjMatrix,  v1 , v2));
        System.out.println(haspathusingDFS(adjMatrix,v1,v2));
    }
}