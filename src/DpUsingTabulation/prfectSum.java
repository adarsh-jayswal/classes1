package DpUsingTabulation;
import java.util.*;
public class prfectSum {
    public int perfectSum(int[] arr, int n, int sum) {
        int mod = 1000000007;
        int[][] dp = new int[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) dp[i][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int s = 0; s <= sum; s++) {
                dp[i][s] = dp[i - 1][s];
                if (arr[i - 1] <= s) {
                    dp[i][s] = (dp[i][s] + dp[i - 1][s - arr[i - 1]]) % mod;
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();

        int target = sc.nextInt();

        prfectSum obj = new prfectSum();
        System.out.println(obj.perfectSum(nums, nums.length, target));
    }
}
