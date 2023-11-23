package ConditionalStatements;

public class TernaryOperator {

    public static void main(String[] args) {

        int larger = (5 > 3) ? 5 : 3;
        System.out.println(larger);

        String t = (5 % 2 == 0) ? "even" : "odd";
        System.out.println(t);

        int num = 4;
        // ternary operator
        String type = (num % 2 == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
