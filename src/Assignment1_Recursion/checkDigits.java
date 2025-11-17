package Assignment1_Recursion;

public class checkDigits{

    static boolean checkDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (s.charAt(index) < '0' || s.charAt(index) > '9') {
            return false;
        }
        return checkDigits(s, index + 1);
    }

    public static void main(String[] args) {
        String str = "12345";
        System.out.println(checkDigits(str, 0));
    }
}

