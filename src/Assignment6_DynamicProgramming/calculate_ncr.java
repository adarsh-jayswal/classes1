package Assignment6_DynamicProgramming;

import java.util.*;

public class calculate_ncr {

    public static int nCr(int n, int r) {
        if(r > n) return 0;

        int[][] dp = new int[n + 1][r + 1];

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= Math.min(i, r); j++){

                if(j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }
            }
        }
        return dp[n][r];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(nCr(n, r));
        sc.close();
    }
}

