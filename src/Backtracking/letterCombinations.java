package Backtracking;
import java.util.*;

public class letterCombinations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digits (2-9): ");
        String digits = sc.nextLine();

        letterCombinations obj = new letterCombinations();
        List<String> result = obj.letterCombinations(digits);

        System.out.println("Possible combinations:");
        System.out.println(result);
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        Map<Character, String> map = getMap();
        solve(0, digits, "", ans, map);
        return ans;
    }

    private void solve(int i, String digits, String current,List<String> ans, Map<Character, String> map) {

        if (i == digits.length()) {
            ans.add(current);
            return;
        }

        String letters = map.get(digits.charAt(i));

        for (char ch : letters.toCharArray()) {
            solve(i + 1, digits, current + ch, ans, map);
        }
    }

    private Map<Character, String> getMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }
}


