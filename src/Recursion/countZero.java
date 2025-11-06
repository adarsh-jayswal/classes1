package Recursion;

public class countZero {
    static int countZero(int n) {
        if (n == 0) {
            return 1;}
        return helper(n, 0);
    }
    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            count++;
        }
        return helper(n / 10, count);
    }
    public static void main(String[] args) {
        int num = 1020300;
        System.out.println(countZero(num));
    }
}

