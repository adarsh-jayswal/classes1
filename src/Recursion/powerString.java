
package Recursion;
import java.util.ArrayList;

public class powerString {

    static void powerString(ArrayList<String> ans, StringBuilder str, String s, int i) {
        if (i == s.length()) {
            ans.add(str.toString());
            return;
        }
        powerString(ans, str, s, i + 1);
        str.append(s.charAt(i));
        powerString(ans, str, s, i + 1);
        str.deleteCharAt(str.length() - 1);
    }

    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        String s = "abc";

        powerString(ans, str, s, 0);

        System.out.println("All subsequences are:");
        for (String sub : ans) {
            System.out.print(" "+sub);
        }
    }
}
