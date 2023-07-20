import java.util.List;
import java .util.ArrayList;
public class DFS {
    public static List<List<Integer>> builGraph(int[][] edges, int v){
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }
    public static void dfs(int src, boolean[] visited, List<List<Integer>> graph, List<Integer> dfs){

        visited[src] = true;
        dfs.add(src);

        for(int nbr : graph.get(src)){
            if(!visited[nbr]){
                dfs(nbr, visited, graph, dfs);
            }

        }

    }
    public static int[] depthFirstSearch( int[][] edges, int v, int src){
        List<List<Integer>> graph = DFS.builGraph(edges, v);
        boolean[] visited = new boolean[v];
        List<Integer> dfs = new ArrayList<>();

        DFS.dfs(src, visited, graph, dfs);
        int[] arr = new int[v];
        for(int i=0; i<v; i++){
            arr[i] = dfs.get(i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int v = 6;
        int[][] edges = new int[][]{{0, 1}, {0, 2}, {0, 5}, {1, 3}, {1, 5}, {2, 3}, {3, 4}, {4, 5}};
        int src = 0;
        for (int a: DFS.depthFirstSearch(edges, v, src)) {
            System.out.print(a + " ");
        }


    }
}
