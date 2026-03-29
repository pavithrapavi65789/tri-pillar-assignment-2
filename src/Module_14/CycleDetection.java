package Module_14;
import java.util.*;

public class CycleDetection {
    int V;
    List<List<Integer>> adj;

    CycleDetection(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    boolean hasCycle(int node, boolean[] visited, int parent) {
        visited[node] = true;

        for (int n : adj.get(node)) {
            if (!visited[n]) {
                if (hasCycle(n, visited, node))
                    return true;
            } else if (n != parent)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetection g = new CycleDetection(4);

        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,0); // cycle

        boolean[] visited = new boolean[4];

        System.out.println(g.hasCycle(0, visited, -1));
    }
}
