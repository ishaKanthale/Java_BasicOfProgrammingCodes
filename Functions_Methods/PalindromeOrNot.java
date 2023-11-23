package Functions_Methods;

public class PalindromeOrNot {

    public static boolean isPalindrome(int n) {

        int temp = n;
        int rev = 0;

        while (temp > 0) {
            int lastDigit = temp % 10;
            rev = (rev * 10) + lastDigit;
            temp /= 10;
        }

        if (n == rev) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }
}
