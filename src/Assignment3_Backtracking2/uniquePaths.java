package Assignment3_Backtracking2;

import java.util.Scanner;

public class uniquePaths {
    public int uniquePaths(int n,int m){
        int[][]grid =new int[n+1][m+1];
        return helper(n,m,grid);
    }
    private int helper(int n, int m,int[][]grid){
        if(n==1||m==1)return 1;
        if(grid[m][n] != 0) return grid[m][n];
        grid[n][m]= helper(n-1,m,grid)+helper(n,m-1,grid);
        return grid[m][m];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns (m): ");
        int m = sc.nextInt();
        sc.close();
        uniquePaths obj = new uniquePaths();
        System.out.println("Number of unique paths: " + obj.uniquePaths(n, m));
    }
}
