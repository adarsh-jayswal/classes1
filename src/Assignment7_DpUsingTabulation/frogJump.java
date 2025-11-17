package Assignment7_DpUsingTabulation;

import java.util.*;

public class frogJump {
    public static int frogJump(int n, int[] heights) {
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int oneStep = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int twoStep = Integer.MAX_VALUE;
            if (i > 1) {
                twoStep = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            }
            dp[i] = Math.min(oneStep, twoStep);
        }

        return dp[n - 1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stones: ");
        int n = sc.nextInt();

        int[] heights = new int[n];
        System.out.println("Enter heights of stones:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int result = frogJump(n, heights);
        System.out.println("Minimum energy required: " + result);
    }
}

