public class HamiltonianCycle {

    final int V = 5;
    int path[];

    boolean isSafe(int v, int[][] graph, int path[], int pos) {
        // Check if this vertex is adjacent to the previous vertex
        if (graph[path[pos - 1]][v] == 0)
            return false;

        // Check if the vertex has already been included
        for (int i = 0; i < pos; i++)
            if (path[i] == v)
                return false;

        return true;
    }

    boolean hamiltonianCycleUtil(int[][] graph, int path[], int pos) {
        // Base case: all vertices are included in the path
        if (pos == V) {
            // Check if there is an edge from last to first vertex
            return graph[path[pos - 1]][path[0]] == 1;
        }

        // Try different vertices as the next candidate
        for (int v = 1; v < V; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;

                if (hamiltonianCycleUtil(graph, path, pos + 1))
                    return true;

                // Backtrack
                path[pos] = -1;
            }
        }

        return false;
    }

    boolean hamiltonianCycle(int[][] graph) {
        path = new int[V];
        for (int i = 0; i < V; i++)
            path[i] = -1;

        path[0] = 0; // Start from vertex 0

        if (!hamiltonianCycleUtil(graph, path, 1)) {
            System.out.println("No Hamiltonian Cycle exists");
            return false;
        }

        printSolution(path);
        return true;
    }

    void printSolution(int[] path) {
        System.out.println("Hamiltonian Cycle found:");
        for (int v : path)
            System.out.print(v + " ");
        System.out.println(path[0]); // Return to start
    }

    public static void main(String[] args) {
        HamiltonianCycle hc = new HamiltonianCycle();

        int graph[][] = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0}
        };

        hc.hamiltonianCycle(graph);
    }
}
