//package Recursion;
//import java.util.*;
//import java.util.ArrayList;
//
//public class abs {
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> ans = new ArrayList<>();
//        backtrack(0, candidates, target, new ArrayList<>(), ans);
//        return ans;
//    }
//
//    private void backtrack(int index, int[] candidates, int target, List<Integer> current, List<List<Integer>> ans) {
//        // Base case: found valid combination
//        if (target == 0) {
//            ans.add(new ArrayList<>(current));
//            return;
//        }
//
//        // End condition
//        if (index == candidates.length || target < 0) return;
//
//        // Option 1: include current element
//        if (candidates[index] <= target) {
//            current.add(candidates[index]);
//            backtrack(index, candidates, target - candidates[index], current, ans);
//            current.remove(current.size() - 1); // backtrack
//        }
//
//        // Option 2: skip current element
//        backtrack(index + 1, candidates, target, current, ans);
//    }
//}

