public class knapsack {
        public static int knapsack(int[] wt, int[] val, int W, int n) {
            int[][] dp = new int[n + 1][W + 1];
    
            for (int i = 0; i <= n; i++) {
                for (int w = 0; w <= W; w++) {
                    if (i == 0 || w == 0)
                        dp[i][w] = 0;
                    else if (wt[i - 1] <= w)
                        dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                    else
                        dp[i][w] = dp[i - 1][w];
                }
            }
    
            return dp[n][W];
        }
    
        public static void main(String[] args) {
            int[] wt = {1, 3, 4, 5};
            int[] val = {10, 40, 50, 70};
            int W = 8;
            int n = wt.length;
    
            int maxValue = knapsack(wt, val, W, n);
            System.out.println("Maximum value: " + maxValue);
        }
    }
    