package DynamicProgramming;

import java.util.*;

public class MinCostClimbingStairs {
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        Integer[] dp = new Integer[n + 1];
        return solve(n, cost, dp);
    }

    private static int solve(int i, int[] cost, Integer[] dp){
        if(i <= 1) return 0;

        if(dp[i] != null) return dp[i];

        int oneStep = cost[i - 1] + solve(i - 1, cost, dp);
        int twoStep = cost[i - 2] + solve(i - 2, cost, dp);

        return dp[i] = Math.min(oneStep, twoStep);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cost = new int[n];

        for(int i = 0; i < n; i++){
            cost[i] = sc.nextInt();
        }

        System.out.println(minCostClimbingStairs(cost));
        sc.close();
    }
}

