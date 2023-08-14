package ForLoop;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int j = 5; j > 0; j--) {
            System.out.println(j);
        }

        int[] arr = { 10, 7, 21, 47, 73 };

        for (int count : arr) {
            System.out.println(count);
        }
    }
}
