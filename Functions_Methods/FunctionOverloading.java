package Functions_Methods;

public class FunctionOverloading {

    //  Calculator
    //  function overloading using parameters
    //  function to calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    //  function to calculate sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //  function to calculate sum of 2 float numbers
    //  function overloading using data types
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(sum(3, 5));
        System.out.println(sum(5, 2, 1));
        System.out.println(sum(3.2f, 4.8f));
    }
}
