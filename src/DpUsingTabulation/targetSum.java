package DpUsingTabulation;
import java.util.*;
public class targetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int x : nums) sum += x;
        if (Math.abs(target) > sum) return 0;

        Integer[][] dp = new Integer[nums.length + 1][sum * 2 + 1];
        return helper(nums, nums.length - 1, target, dp, sum);
    }

    int helper(int[] nums, int n, int target, Integer[][] dp, int offset) {
        if (n < 0 && target == 0) return 1;
        if (n < 0 || Math.abs(target) > offset) return 0;

        if (dp[n][target + offset] != null) return dp[n][target + offset];

        int ways = 0;
        ways += helper(nums, n - 1, target + nums[n], dp, offset);
        ways += helper(nums, n - 1, target - nums[n], dp, offset);

        return dp[n][target + offset] = ways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int target = sc.nextInt();

        targetSum obj = new targetSum();
        System.out.println(obj.findTargetSumWays(nums, target));
    }
}
