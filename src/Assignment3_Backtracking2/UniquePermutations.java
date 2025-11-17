package Assignment3_Backtracking2;

import java.util.*;

public class UniquePermutations {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, used, current, result);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String[] input = sc.nextLine().trim().split("\\s+");
        int[] nums = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        UniquePermutations solver = new UniquePermutations();
        List<List<Integer>> result = solver.permuteUnique(nums);

        System.out.println("Unique permutations:");
        for (List<Integer> perm : result) {
            System.out.println(perm);
        }

        sc.close();
    }
}
