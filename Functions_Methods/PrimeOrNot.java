package Functions_Methods;

public class PrimeOrNot {

    public static void primesInRange(int n) {

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // only for n >=2
    public static boolean isPrime(int n) {

        //  Corner cases
        //  2
        if (n == 2) {
            return true;
        }

//        for (int i = 2; i <= n-1; i++) {
        for (int i = 2; i <= Math.sqrt(n); i++) {   //  Optimized Code
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(5));
        System.out.println(isPrime(12));
        System.out.println(isPrime(2));
        System.out.println(isPrime(7));
        System.out.println(isPrime(16));
        primesInRange(20);  //  2 to 20
        primesInRange(100);
    }
}
