import java.util.ArrayList;
public class AdjacencyListUsingArrayOfArrayList {
    static class Edge{
//        public int w;
        int src;
        int dest;
        int weight;
        public Edge(int src, int dest, int w){
            this.src = src;
            this.dest = dest;
            this.weight = w;
        }
    }
    public static void buildGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2, 6));

        graph[1].add(new Edge(1, 2, 5));
        graph[1].add(new Edge(1,3, 3));

        graph[2].add(new Edge(2,0, 5));
        graph[2].add(new Edge(2, 1, 5));
        graph[2].add(new Edge(2,3, 6));

        graph[3].add(new Edge(3,1, 3));
        graph[3].add(new Edge(3, 2, 6));
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        buildGraph(graph);
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.dest+" ,"+ e.weight);
        }
    }
}
