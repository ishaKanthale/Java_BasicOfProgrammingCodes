package Loops;

public class PrintReverseOfANumber {

    public static void main(String[] args) {

        int n = 234567;

        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n /= 10;
        }
        System.out.println();
    }
}
