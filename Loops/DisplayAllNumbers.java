package Loops;

import java.util.Scanner;

public class DisplayAllNumbers {

    //  Display all numbers entered by user except multiples of 10
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println(num);
        } while (true);
    }
}
