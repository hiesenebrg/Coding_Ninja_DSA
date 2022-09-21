/**
 * getPath
 */
import java.util.*;
public class getPath {
    public static ArrayList<Integer> getpathhelperusingDFS(int[][] adjMatrix, int v1 , int v2 , boolean[] isboolean){
        if(v1==v2){
            ArrayList<Integer> arr = new ArrayList<>();
            isboolean[v1] = true;
            arr.add(v2);
            return arr;
        }
        isboolean[v1] = true;
            for(int i = 0; i<adjMatrix.length;i++){
                    if(adjMatrix[v1][i]>0 && !isboolean[i]){
                        ArrayList<Integer> arr = getpathhelperusingDFS(adjMatrix, v1, v2, isboolean);
                        if(arr!=null){
                            arr.add(v1);
                            return arr;
                        }
                    }
            }
            return null;
    }
    public static ArrayList<Integer> getpathusingDFS(int[][] adjMatrix, int v1 , int v2){
        boolean[] isboolean = new boolean[adjMatrix.length];
        return getpathhelperusingDFS(adjMatrix, 0 , v2 , isboolean);
    }
    public static ArrayList<Integer> getpathusingBFS(int[][] adjMatrix, int v1 , int v2){
        boolean[] isVisited = new boolean[adjMatrix.length];
        HashMap<Integer, Integer> hs = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
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
                    hs.put(i, first);
                }if(i==v2){
                    ans.add(i);
                    while(!ans.contains(v1)){
                        System.out.println(ans);
                        int b  = hs.get(i);
                        ans.add(b);
                        i = b;
                    }
                    return ans;
                }
            }
        }
        return ans;
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
        // System.out.println(getpathusingDFS(adjMatrix,  v1 , v2));
        System.out.println(getpathusingBFS(adjMatrix,v1,v2));
    }
}