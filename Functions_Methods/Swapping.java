package Functions_Methods;

public class Swapping {

    public static void swap(int a, int b) {

        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {

        //  Swap - values exchange
        int a = 5;
        int b = 10;

        swap(a, b);

        System.out.println(a);
        System.out.println(b);

//        a = a + b;
//        b = a - b;
//        a = a - b;
    }
}
