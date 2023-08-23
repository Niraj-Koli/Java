package Lambdas;

public class Lambdas {
    public static void main(String[] args) {
        // new Thread(new Runnable() {
        // @Override
        // public void run() {
        // System.out.println("Printing from Runnable");
        // System.out.println("Through Lambda Expression");
        // System.out.format("This is formatting style number = %d\n\n", 69);
        // }
        // }).start();

        new Thread(() -> {
            System.out.println("Printing from Runnable");
            System.out.println("Through Lambda Expression");
            System.out.format("This is formatting style number = %d\n\n", 17);
        }).start();
    }
}
