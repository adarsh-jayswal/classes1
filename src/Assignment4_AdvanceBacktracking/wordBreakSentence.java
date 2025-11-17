package Assignment4_AdvanceBacktracking;

import java.util.*;

public class wordBreakSentence {

    public static List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Map<Integer, List<String>> memo = new HashMap<>();
        return solve(s, 0, set, memo);
    }

    private static List<String> solve(String s, int idx, Set<String> dict, Map<Integer, List<String>> memo) {
        if (memo.containsKey(idx)) return memo.get(idx);

        List<String> res = new ArrayList<>();
        if (idx == s.length()) {
            res.add("");
            return res;
        }

        for (int end = idx + 1; end <= s.length(); end++) {
            String part = s.substring(idx, end);
            if (dict.contains(part)) {
                List<String> next = solve(s, end, dict, memo);
                for (String t : next) {
                    if (t.equals("")) res.add(part);
                    else res.add(part + " " + t);
                }
            }
        }

        memo.put(idx, res);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();

        List<String> wordDict = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            wordDict.add(sc.nextLine());
        }

        List<String> ans = wordBreak(s, wordDict);
        for (String sentence : ans) {
            System.out.println(sentence);
        }
    }
}

