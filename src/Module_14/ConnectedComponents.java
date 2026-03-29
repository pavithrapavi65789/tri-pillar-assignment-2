package Module_14;
import java.util.*;

public class ConnectedComponents {
    int V;
    List<List<Integer>> adj;

    ConnectedComponents(int V) {
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

        for (int n : adj.get(node)) {
            if (!visited[n])
                DFS(n, visited);
        }
    }

    int countComponents() {
        boolean[] visited = new boolean[V];
        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(i, visited);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ConnectedComponents g = new ConnectedComponents(5);

        g.addEdge(0,1);
        g.addEdge(1,2);
        // 3 and 4 separate

        System.out.println("Components: " + g.countComponents());
    }
}

