package Loops;

import java.util.Scanner;

public class PrimeOrNot {

    //  Check if a number is prime or not
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

//        for (int i = 2; i <= n-1; i++) {
//            if (n % 1 == 0) {
//                isPrime = false;
//                break;
//            }
//        }
        if (n == 2) {
            System.out.println(n + " is a prime number");
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % 1 == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not prime number");
            }
        }
    }
}
