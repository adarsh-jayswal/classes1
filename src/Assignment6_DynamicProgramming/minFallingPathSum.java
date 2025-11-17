package Assignment6_DynamicProgramming;

class Solution {
    private int solve(int[][] grid, int i, int j, int[][] dp) {
        int m = grid[0].length;

        // Out of bounds
        if (j < 0 || j >= m) return Integer.MAX_VALUE;

        // Base case
        if (i == 0) return grid[0][j];

        // Check memo
        if (dp[i][j] != -1) return dp[i][j];

        // Recursive calls
        int up = grid[i][j] + solve(grid, i - 1, j, dp);
        int left = grid[i][j] + solve(grid, i - 1, j - 1, dp);
        int right = grid[i][j] + solve(grid, i - 1, j + 1, dp);
        return dp[i][j] = Math.min(up, Math.min(left, right));
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = Integer.MAX_VALUE;

        int[][] dp = new int[n][m];
        for (int[] row : dp) java.util.Arrays.fill(row, -1);
        for (int j = 0; j < m; j++) {
            ans = Math.min(ans, solve(matrix, n - 1, j, dp));
        }

        return ans;
    }
}

