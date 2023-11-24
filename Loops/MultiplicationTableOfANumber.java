package Loops;

import java.util.Scanner;

public class MultiplicationTableOfANumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Table of " + n + " : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
