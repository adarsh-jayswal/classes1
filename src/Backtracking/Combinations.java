package Backtracking;
import java.util.*;
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), ans);
        return ans;
    }
    private void backtrack(int start, int n, int k, List<Integer> current, List<List<Integer>> ans) {
        if (current.size() == k) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (int num = start; num <= n; num++) {
            current.add(num);
            backtrack(num + 1, n, k, current, ans);
            current.remove(current.size() - 1); // backtrack
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        Combinations obj = new Combinations();
        List<List<Integer>> result = obj.combine(n, k);
        System.out.println("Combinations:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}

