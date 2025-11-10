package AdvanceBacktracking;

import java.util.*;

public class Nqueen2 {

    public int totalNQueens(int n) {
        return solve(0, n, new boolean[n], new boolean[2 * n], new boolean[2 * n]);
    }

    private int solve(int row, int n, boolean[] cols, boolean[] diag1, boolean[] diag2) {
        if (row == n) return 1;

        int count = 0;
        for (int col = 0; col < n; col++) {
            int d1 = row - col + n;
            int d2 = row + col;

            if (cols[col] || diag1[d1] || diag2[d2]) continue;

            cols[col] = diag1[d1] = diag2[d2] = true;
            count += solve(row + 1, n, cols, diag1, diag2);
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Nqueen2 obj = new Nqueen2();
        int result = obj.totalNQueens(n);
        System.out.println(result);
    }
}

