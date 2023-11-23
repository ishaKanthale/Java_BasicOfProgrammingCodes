package Functions_Methods;

public class BinomialCofficient {

    public static int factorial(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binCoeff(int n, int r) {

        int nFact = factorial(n);
        int rFact = factorial(r);
        int nMrFact = factorial(n - r);

        return nFact / (rFact * nMrFact);
    }

    public static void main(String[] args) {

        int n = 5;
        int r = 2;

        System.out.println(binCoeff(n, r));
    }
}
