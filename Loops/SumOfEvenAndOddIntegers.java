package Loops;

import java.util.Scanner;

public class SumOfEvenAndOddIntegers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int integer;
        int choice;
        int sumOfEven = 0;
        int sumOfOdd = 0;

        do {
            integer = sc.nextInt();
            if (integer % 2 == 0) {
                sumOfEven += integer;
            } else {
                sumOfOdd += integer;
            }

            System.out.println("So you want to continue? Press 1 for yes Or 0 for no");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of even number is : " + sumOfEven);
        System.out.println("Sum of odd number is : " + sumOfOdd);
    }
}
