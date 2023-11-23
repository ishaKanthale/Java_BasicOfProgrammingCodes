package ConditionalStatements;

import java.util.Scanner;

public class PositiveOrNagative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("positive number");
        } else {
            System.out.println("negative number");
        }
    }
}
