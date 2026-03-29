package Module_14;
import java.util.*;

public class BipartiteGraph {
    int V;
    List<List<Integer>> adj;

    BipartiteGraph(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    boolean isBipartite() {
        int[] color = new int[V];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        color[0] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int n : adj.get(node)) {
                if (color[n] == -1) {
                    color[n] = 1 - color[node];
                    q.add(n);
                } else if (color[n] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        BipartiteGraph g = new BipartiteGraph(4);

        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);

        System.out.println(g.isBipartite());
    }
}
