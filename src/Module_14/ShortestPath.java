package Module_14;
import java.util.*;

public class ShortestPath {
    int V;
    List<List<Integer>> adj;

    ShortestPath(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void shortestPath(int start) {
        int[] dist = new int[V];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        dist[start] = 0;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int n : adj.get(node)) {
                if (dist[n] == -1) {
                    dist[n] = dist[node] + 1;
                    q.add(n);
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args) {
        ShortestPath g = new ShortestPath(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);

        g.shortestPath(0);
    }
}
