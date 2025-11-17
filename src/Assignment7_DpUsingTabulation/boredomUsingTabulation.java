package Assignment7_DpUsingTabulation;
import java.util.*;
public class boredomUsingTabulation {
    public static long solve(int[] arr) {
        int n = arr.length;
        int maxVal = 0;
        for (int num : arr) {
            maxVal = Math.max(maxVal, num);
        }


        long[] freq = new long[maxVal + 1];
        for (int num : arr) {
            freq[num]++;
        }


        long[] dp = new long[maxVal + 1];
        dp[0] = 0;
        dp[1] = freq[1];

        for (int i = 2; i <= maxVal; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + freq[i] * i);
        }

        return dp[maxVal];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long result = solve(arr);
        System.out.println("Maximum points that can be earned: " + result);
    }
}

