package Functions_Methods;

import java.util.Scanner;

public class CalculateSum {

    public static int sum(int a, int b) {   // parameters or formal parameters
        return a + b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a, b);    //  arguments or actual parameters
        System.out.println("Sum is : " + sum);
    }
}
