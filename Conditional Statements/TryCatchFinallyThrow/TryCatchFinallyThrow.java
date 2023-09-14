package TryCatchFinallyThrow;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TryCatchFinallyThrow {
    public static int divide() {
        int x, y;

        try {
            x = getInt();
            y = getInt();

            System.out.println("x is " + x + " & y is " + y);

            return x / y;
        } catch (NoSuchElementException e) {
            throw new ArithmeticException("No Suitable Input");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Attempt To Divide By Zero");
        }
    }

    public static int getInt() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter An Integer: ");

        while (true) {
            try {
                return s.nextInt();

            } catch (InputMismatchException e) {
                s.nextLine();
                s.close();
                System.out.println("Please enter a number using only the digits from 0 to 9: ");
            }
        }

    }

    public static void main(String[] args) {
        try {
            int result = divide();

            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("Unable To Perform Division");
        } finally {
            System.out.println("Code Run Successfully!");
        }
    }
}
