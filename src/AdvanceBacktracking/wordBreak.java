package AdvanceBacktracking;

import java.util.*;

public class wordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        return solve(s, 0, set, new Boolean[s.length()]);
    }

    private static boolean solve(String s, int idx, Set<String> dict, Boolean[] dp) {
        if (idx == s.length()) return true;
        if (dp[idx] != null) return dp[idx];

        for (int end = idx + 1; end <= s.length(); end++) {
            String part = s.substring(idx, end);
            if (dict.contains(part) && solve(s, end, dict, dp)) {
                return dp[idx] = true;
            }
        }

        return dp[idx] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();

        List<String> wordDict = new ArrayList<>();
        for(int i = 0; i < n; i++){
            wordDict.add(sc.nextLine());
        }

        boolean result = wordBreak(s, wordDict);
        System.out.println(result);
    }
}

