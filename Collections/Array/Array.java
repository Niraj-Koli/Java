package Array;

public class Array {
    public static void main(String[] args) {

        int[] alpha = new int[10];
        alpha[0] = 56;
        alpha[4] = 2;
        alpha[9] = 91;

        System.out.println(alpha[0]);
        System.out.println(alpha[4]);
        System.out.println(alpha[9]);

        System.out.println("");

        int[] beta = { 10, 7, 21, 47, 73 };

        System.out.println(beta[0]);
        System.out.println(beta[2]);
        System.out.println(beta[4]);

        System.out.println("");

        int[] gamma = new int[7];

        for (int i = 0; i < gamma.length; i++) {
            gamma[i] = i * 10;
            System.out.println("Index " + i + ": " + gamma[i]);
        }
    }
}