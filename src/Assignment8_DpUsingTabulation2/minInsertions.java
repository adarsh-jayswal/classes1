package Assignment8_DpUsingTabulation2;

import java.util.*;

class minInsertions {
    public int minInsertions(String s) {
        String r = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == r.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = dp[i - 1][j] > dp[i][j - 1] ? dp[i - 1][j] : dp[i][j - 1];
                }
            }
        }

        int lps = dp[n][n];
        return n - lps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        minInsertions obj = new minInsertions();
        System.out.println(obj.minInsertions(s));
    }
}

