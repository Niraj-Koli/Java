package ScannerInterface;

import java.util.Scanner;

public class ScannerInterface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(input.nextLine());
        System.out.println(input.nextInt());
        System.out.println(input.nextDouble());
        System.out.println(input.nextBoolean());
        System.out.println(input.next());

        input.close();
    }
}
