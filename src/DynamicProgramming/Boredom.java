package DynamicProgramming;

import java.util.*;

public class Boredom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] freq = new int[100001];
        int maxVal = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            freq[x]++;
            maxVal = Math.max(maxVal, x);
        }

        long[] dp = new long[maxVal + 1];

        dp[0] = 0;
        dp[1] = freq[1];

        for(int i = 2; i <= maxVal; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + (long)i * freq[i]);
        }

        System.out.println(dp[maxVal]);
        sc.close();
    }
}

