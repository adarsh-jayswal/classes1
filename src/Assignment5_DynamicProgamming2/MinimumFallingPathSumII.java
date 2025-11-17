package Assignment5_DynamicProgamming2;

public class MinimumFallingPathSumII {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        minFallingPathSum sol = new minFallingPathSum();
        int result = sol.minFallingPathSum(grid);
        System.out.println("Minimum Falling Path Sum II: " + result);
    }
}

class minFallingPathSum {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, solve(0, j, grid, dp));
        }

        return min;
    }

    private int solve(int i, int j, int[][] grid, int[][] dp) {
        int n = grid.length;

        if (i == n - 1) return grid[i][j];
        if (dp[i][j] != -1) return dp[i][j];

        int min = Integer.MAX_VALUE;

        for (int col = 0; col < n; col++) {
            if (col != j) {
                int cost = grid[i][j] + solve(i + 1, col, grid, dp);
                min = Math.min(min, cost);
            }
        }

        return dp[i][j] = min;
    }
}


