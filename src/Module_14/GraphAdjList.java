package Module_14;
import java.util.*;

public class GraphAdjList {
    int V;
    List<List<Integer>> adj;

    GraphAdjList(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int n : adj.get(i))
                System.out.print(n + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjList g = new GraphAdjList(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);

        g.printGraph();
    }
}
