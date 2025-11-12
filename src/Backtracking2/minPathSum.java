package Backtracking2;

class minPathSum{
    private int solve(int[][] grid, int i, int j, int[][] dp) {
        if (i == 0 && j == 0) return grid[0][0];
        if (i < 0 || j < 0) return Integer.MAX_VALUE;
        if (dp[i][j] != -1) return dp[i][j];
        int up = solve(grid, i - 1, j, dp);
        int left = solve(grid, i, j - 1, dp);

        dp[i][j] = grid[i][j] + Math.min(up, left);
        return dp[i][j];
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            java.util.Arrays.fill(row, -1);
        }
        return solve(grid, n - 1, m - 1, dp);
    }
}

