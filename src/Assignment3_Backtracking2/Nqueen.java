package Assignment3_Backtracking2;

import java.util.*;

public class Nqueen {
    private int count = 0;
    private boolean[] cols;
    private boolean[] diag1;
    private boolean[] diag2;

    public int totalNQueens(int n) {
        cols = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];
        backtrack(0, n);
        return count;
    }

    private void backtrack(int row, int n) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols[col] || diag1[row + col] || diag2[row - col + n - 1])
                continue;

            cols[col] = diag1[row + col] = diag2[row - col + n - 1] = true;
            backtrack(row + 1, n);
            cols[col] = diag1[row + col] = diag2[row - col + n - 1] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Nqueen solver = new Nqueen();
        int solutions = solver.totalNQueens(n);

        System.out.println("Number of distinct solutions: " + solutions);
        sc.close();
    }
}

