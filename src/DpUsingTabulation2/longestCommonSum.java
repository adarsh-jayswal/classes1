package DpUsingTabulation2;



class longestCommonSum {

    public static int longestCommonSubstr(String s1, String s2) {

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        int n = str1.length;
        int m = str2.length;

        int[][] dp = new int[n + 1][m + 1];
        int max = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "abfce";

        int ans = longestCommonSubstr(s1, s2);

        System.out.println("Longest Common Substring Length = " + ans);
    }
}

