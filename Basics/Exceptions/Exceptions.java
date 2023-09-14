package Exceptions;

// Two Exceptions Approaches //
// LBYL = Look Before You Leave //
// EAFP = Easy To Ask For Forgiveness Than Permission //

public class Exceptions {
    public static void main(String[] args) {
        int x = 7;
        int y = 0;

        // System.out.println(divide(x, y));
        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));
    }

    // private static int divide(int x, int y) {
    // return x / y;
    // }

    private static int divideLBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

}
