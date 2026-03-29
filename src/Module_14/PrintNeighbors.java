package Module_14;
import java.util.*;

public class PrintNeighbors {
    int V;
    List<List<Integer>> adj;

    PrintNeighbors(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    void printNeighbors(int node) {
        for (int n : adj.get(node))
            System.out.print(n + " ");
    }

    public static void main(String[] args) {
        PrintNeighbors g = new PrintNeighbors(4);

        g.addEdge(0,1);
        g.addEdge(0,2);

        g.printNeighbors(0);
    }
}
