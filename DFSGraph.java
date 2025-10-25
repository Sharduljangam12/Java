import java.util.*;

public class DFSGraph {
    private int V;                      // number of vertices
    private LinkedList<Integer>[] adj; // adjacency list

    // Constructor
    DFSGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    // Add edge to graph
    void addEdge(int v, int w) {
        adj[v].add(w); // directed edge v -> w
    }

    // DFS utility function
    void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : adj[v]) {
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // DFS traversal starting from given vertex
    void DFS(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS Traversal: ");
        DFSUtil(start, visited);
    }

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.DFS(0);  // Start DFS from vertex 0
    }
}
