package ConditionalStatements;

public class SwitchStatement {

    public static void main(String[] args) {

        int number = 6;
        switch (number) {
            case 1:
                System.out.println("samosa");
                break;

            case 2:
                System.out.println("burger");
                break;

            case 3:
                System.out.println("mango shake");
                break;

            default:
                System.out.println("we wake up");
        }
        
        char ch ='a';
        switch (ch) {
            case 'a':
                System.out.println("samosa");
                break;

            case 'b':
                System.out.println("burger");
                break;

            case 'c':
                System.out.println("mango shake");
                break;

            default:
                System.out.println("we wake up");
        }

    }
}
