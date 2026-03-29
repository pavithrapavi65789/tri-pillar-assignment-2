package Module_14;
import java.util.*;

public class TraverseGraph {
    int V;
    List<List<Integer>> adj;

    TraverseGraph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void DFS(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int n : adj.get(node)) {
            if (!visited[n])
                DFS(n, visited);
        }
    }

    public static void main(String[] args) {
        TraverseGraph g = new TraverseGraph(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);

        boolean[] visited = new boolean[4];
        g.DFS(0, visited);
    }
}
