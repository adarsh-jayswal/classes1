package Assignment2_Backtracking;
import java.util.Scanner;

public class MoreOnesThanZeros {

    public static void generate(int n) {
        solve(n, 0, 0, "");
    }
    private static void solve(int n, int ones, int zeros, String current) {
        if (current.length() == n) {
            if (ones > zeros) {
                System.out.println(current);
            }
            return;
        }
        solve(n, ones + 1, zeros, current + "1");
        if (ones > zeros) {
            solve(n, ones, zeros + 1, current + "0");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n :-");
        int n = sc.nextInt();
        generate(n);
    }
}



