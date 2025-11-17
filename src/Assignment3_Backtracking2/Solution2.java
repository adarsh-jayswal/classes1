package Assignment3_Backtracking2;

import java.util.*;

public class Solution2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int balance = 0;
            int minBalance = 0;

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    balance++;
                } else {
                    balance--;
                }
                minBalance = Math.min(minBalance, balance);
            }

            System.out.println(-minBalance);
        }
        sc.close();
    }
}

