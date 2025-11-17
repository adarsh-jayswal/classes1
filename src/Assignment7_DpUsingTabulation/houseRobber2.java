package Assignment7_DpUsingTabulation;

import java.util.*;

public class houseRobber2 {


    public static int robLinear(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int pick = nums[i] + dp[i - 2];
            int notPick = dp[i - 1];
            dp[i] = Math.max(pick, notPick);
        }

        return dp[n - 1];
    }


    public static int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        // Case 1: Exclude first house
        int[] temp1 = Arrays.copyOfRange(nums, 1, n);
        // Case 2: Exclude last house
        int[] temp2 = Arrays.copyOfRange(nums, 0, n - 1);

        return Math.max(robLinear(temp1), robLinear(temp2));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of houses: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter amount of money in each house:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = rob(nums);
        System.out.println("Maximum amount that can be robbed: " + result);
    }
}

