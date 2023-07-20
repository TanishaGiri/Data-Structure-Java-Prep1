import java.util.List;
import java.util.ArrayList;

public class FindingIndegreeAndOutdegree {

    public static List<List<Integer>> buildGraph(int[][] edges, int v){
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
    public static void indegreeAndOutdegree(int[][] edges, int v){
        List<List<Integer>> graph = FindingIndegreeAndOutdegree.buildGraph(edges, v);
        int[] in = new int[v];
        int[] out = new int[v];

        for(int i=0; i<graph.size(); i++){
            List<Integer> list = graph.get(i);
            out[i] = list.size();
            for(int j=0; j<list.size(); j++){
                in[list.get(j)]++;
            }
        }

        System.out.println("Vertex\tIn\tOut");
        for (int k = 0; k < v; k++) {
            System.out.println(k + "\t" + in[k] + "\t" + out[k]);
        }
    }
    public static void main(String[] args) {
        int v = 7;
        int[][] edges = {{1, 2}, {1, 5}, {2, 3}, {2, 4}, {3, 4}, {3, 6}, {4, 6}, {5, 6}};
        indegreeAndOutdegree( edges, v);
    }
}
