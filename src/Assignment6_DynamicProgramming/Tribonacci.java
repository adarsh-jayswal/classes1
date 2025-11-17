package Assignment6_DynamicProgramming;

import java.util.*;

public class Tribonacci {

    public static int tribonacci(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;

        int a = 0, b = 1, c = 1;
        int ans = 0;

        for(int i = 3; i <= n; i++){
            ans = a + b + c;
            a = b;
            b = c;
            c = ans;
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tribonacci(n));
        sc.close();
    }
}

