
public class ConvertFromBinaryToDecimal {

    public static int decimal(int n) {

        int dec = 0, pow = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            n /= 10;
        }
        return dec;
    }

    public static void main(String[] args) {

        int n = 101;

        System.out.println("Decimal number of " + n + " is " + decimal(n));
    }
}
