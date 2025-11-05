package Recursion;
import java.util.Scanner;
public class CountNumberOfDigits {
    static int countDigits(int n){
        if (n<0) n = -n;
        if(n == 0 )return 0;
        return 1+ countDigits(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println("Total digits: " + countDigits(n));


    }
}
