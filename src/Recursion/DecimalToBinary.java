package Recursion;

public class DecimalToBinary {

    static String toBinary(int n) {
        if (n == 0) {
            return "";
        }
        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int num = 10;
        String result = toBinary(num);
        if (result.equals("")) result = "0";
        System.out.println(result);
    }
}

