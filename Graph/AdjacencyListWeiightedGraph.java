import java.util.*;
public class AdjacencyListWeiightedGraph {
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    public static List<List<Edge>> createGraph(int v, int[][] edges){
        List<List<Edge>> graph = new ArrayList<>();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }
        for(int [] edge: edges){
            graph.get(edge[0]).add(new Edge(edge[0], edge[1], 1));
            graph.get(edge[1]).add(new Edge(edge[1], edge[0], 1));
        }

        return graph;
    }
    public static void printGraph(List<List<Edge>> graph, int[][] edges, int v){
        graph = AdjacencyListWeiightedGraph.createGraph(v, edges);

        for(int i=0; i<graph.size(); i++){
            System.out.print(i +" : ");
            for(Edge edge : graph.get(i)){

                System.out.print(edge.dest + " (Weight: " + edge.weight + ") , ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int v = 7;
        int [][] edges = new int[][]{{1, 2}, {1, 5}, {2, 3}, {2, 4}, {3, 4}, {3, 6}, {4, 6}, {5, 6}};
        List<List<Edge>> graph = AdjacencyListWeiightedGraph.createGraph(v, edges);
        AdjacencyListWeiightedGraph.printGraph(graph, edges, v);

    }
}
