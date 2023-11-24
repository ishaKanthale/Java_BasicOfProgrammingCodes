package Loops;

import java.util.Scanner;

public class KeepEnteringNumber {

    //  Keep entering number till user enter a multiple of 10
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        do {
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
        } while (true);
    }
}
