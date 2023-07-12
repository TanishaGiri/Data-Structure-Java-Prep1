import java.util.List;
import java.util.ArrayList;

public class ComplementOfAGraph {
    public static List<List<Integer>> buildGraph(int v, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        return graph;
    }

    public static List<List<Integer>> complement(int v, int[][] edges) {
        List<List<Integer>> graph = ComplementOfAGraph.buildGraph(v, edges);

        List<List<Integer>> complementList = new ArrayList<>(graph.size());

        for (int i = 0; i < graph.size(); i++) {
            complementList.add(new ArrayList<>());
        }
        for (int i = 0; i < graph.size(); i++) {
            for (int j = 0; j < graph.size(); j++) {
                if (i != j && !graph.get(i).contains(j)) {
                    complementList.get(i).add(j);
                }
            }
        }
        return complementList;
    }

    public static void printGraph(int v, int[][] edges) {
        List<List<Integer>> complementList = ComplementOfAGraph.complement(v, edges);
        for (int i = 0; i < complementList.size(); i++) {
            System.out.print(i + " : ");
            for (int nbr : complementList.get(i)) {
                System.out.print(nbr + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 5;
        int[][] edges = {{4,2}, {1,2}, {1, 3}};
        ComplementOfAGraph.printGraph(v, edges);
    }
}
