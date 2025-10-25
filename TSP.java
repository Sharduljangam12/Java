public class TSP {

    static int V = 4; // Number of cities
    static int[][] graph = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    };

    static boolean[] visited = new boolean[V];
    static int minPath = Integer.MAX_VALUE;

    static void tsp(int currPos, int count, int cost, int start) {
        if (count == V && graph[currPos][start] > 0) {
            minPath = Math.min(minPath, cost + graph[currPos][start]);
            return;
        }

        for (int i = 0; i < V; i++) {
            if (!visited[i] && graph[currPos][i] > 0) {
                visited[i] = true;
                tsp(i, count + 1, cost + graph[currPos][i], start);
                visited[i] = false; // Backtrack
            }
        }
    }

    public static void main(String[] args) {
        visited[0] = true; // Start from city 0
        tsp(0, 1, 0, 0);
        System.out.println("Minimum cost: " + minPath);
    }
}
