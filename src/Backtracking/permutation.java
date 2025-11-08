package Backtracking;

//import java.util.*;
//
//class Solution {
//    public List<String> permute(String s) {
//        List<String> res = new ArrayList<>();
//        backtrack(s, "", res, new boolean[s.length()]);
//        return res;
//    }
//    private void backtrack(String s, String curr, List<String> res, boolean[] used) {
//        if (curr.length() == s.length()) {
//            res.add(curr);
//            return;
//        }
//        for (int i = 0; i < s.length(); i++) {
//            if (used[i]) continue;
//            used[i] = true;
//            backtrack(s, curr+ s.charAt(i), res, used);
//            used[i] = false;
//        }
//    }
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        String s = "ABC";
//        List<String> permutations = sol.permute(s);
//        System.out.println(permutations);
//    }
//}
class permutation {
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void permutation(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(String.valueOf(arr));
            return;
        }

        for (int j = index; j < arr.length; j++) {
            swap(arr, index, j);
            permutation(arr, index + 1);
            swap(arr, index, j); // backtrack
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        char[] arr = s.toCharArray();
        permutation(arr, 0);
    }
}