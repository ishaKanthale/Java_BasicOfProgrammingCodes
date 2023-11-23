package ConditionalStatements;

public class PassOrFail {

    public static void main(String[] args) {

        int marks = 31;
        String reportCard = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(reportCard);
    }
}
