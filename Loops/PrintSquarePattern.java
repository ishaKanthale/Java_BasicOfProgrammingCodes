package Loops;

public class PrintSquarePattern {

    public static void main(String[] args) {

        for (int line = 1; line <= 4; line++) {
            System.out.println("* * * *");
        }

        System.out.println("-------------");
        
        int line = 1;
        while (line <= 4) {
            System.out.println("* * * *");
            line++;
        }
    }
}
