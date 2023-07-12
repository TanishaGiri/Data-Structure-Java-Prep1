import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
public class BFS {
    public static List<List<Integer>> buildGraph(int v, int[][] edges){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }
        for(int [] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        return graph;
    }
    public static List<Integer> bfs(int v, int[][] edges, int src){
        List<List<Integer>> graph = BFS.buildGraph(v, edges);

        Queue<Integer> queue = new LinkedList<Integer>();
        boolean[] visited = new boolean[v+1];

        queue.offer(src);
        visited[src] = true;

        List<Integer> bfsList = new ArrayList<>();
        while(!queue.isEmpty()) {
            int node = queue.poll();
            bfsList.add(node);

            for (int nbr : graph.get(node)) {
                if (!visited[nbr]) {
                    queue.offer(nbr);
                    visited[nbr] = true;
                }
            }
        }
        return bfsList;
    }
    public static void printGraph(int v, int[][] edges){
        List<List<Integer>> graph = BFS.buildGraph(v, edges);
        for(int i=0; i<v; i++){
            System.out.print(i +" : ");
            for(int nbr : graph.get(i)){
                System.out.print(nbr + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int v= 5;
        int[][] edges = {{4,3},{1,2},{1,3}};
        BFS.printGraph(v, edges);
        System.out.println(BFS.bfs(v, edges, 1));
    }
}
