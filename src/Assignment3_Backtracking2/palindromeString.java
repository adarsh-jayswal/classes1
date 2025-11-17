package Assignment3_Backtracking2;

import java.util.*;

public class palindromeString {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(0, 0, s, new ArrayList<>(), ans);
        return ans;
    }

    private void solve(int start, int end, String s, List<String> cur, List<List<String>> ans) {
        if (end == s.length() - 1) {
            if (isPalindrome(start, end, s)) {
                cur.add(s.substring(start, end + 1));
                ans.add(new ArrayList<>(cur));
                cur.remove(cur.size() - 1);
            }
            return;
        }

        if (isPalindrome(start, end, s)) {
            cur.add(s.substring(start, end + 1));
            solve(end + 1, end + 1, s, cur, ans);
            cur.remove(cur.size() - 1);
        }

        solve(start, end + 1, s, cur, ans);
    }

    private boolean isPalindrome(int start, int end, String s) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        palindromeString obj = new palindromeString();
        List<List<String>> result = obj.partition(s);
        System.out.println(result);
    }
}

