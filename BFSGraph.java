import java.util.*;
public class BFSGraph {
    private int V;                         // number of vertices
    private LinkedList<Integer>[] adj;    // adjacency list

    // Constructor
    BFSGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    // Add edge to the graph
    void addEdge(int v, int w) {
        adj[v].add(w); // directed edge from v to w
    }

    // Perform BFS starting from given source
    void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adj[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSGraph g = new BFSGraph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.BFS(0);  // Start BFS from vertex 0
    }
}