import java.util.List;
import java.util.ArrayList;
public class AdjacencyList {
    public static List<List<Integer>> buildGraph(int v, int[][] edges){
      List<List<Integer>> graph = new ArrayList<>();
      for(int i=0; i<=v; i++){
          graph.add(new ArrayList<>());
      }
      for(int[] edge: edges){
          graph.get(edge[0]).add(edge[1]);
          graph.get(edge[1]).add(edge[0]);
      }
      return graph;
    }
    public static void printGraph(int v, int[][] edges){
        List<List<Integer>> graph = AdjacencyList.buildGraph(v, edges);
        for(int i=1; i<=v; i++){
            System.out.print(i+" : ");
            for(int nbr : graph.get(i)){
                System.out.print(nbr +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int v= 6;
        int [][] edges = new int[][]{{1, 2}, {1, 5}, {2, 3}, {2, 4}, {3, 4}, {3, 6}, {4, 6}, {5, 6}};
        AdjacencyList.printGraph(v, edges);
    }
}
