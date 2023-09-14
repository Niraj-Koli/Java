package LogicalOperations;

public class LogicalOperations {
    public static void main(String[] args) {
        int x = 10;

        System.out.println(x < 10 && x > 7);
        System.out.println(x < 10 || x > 7);
        System.out.println(!(x < 10 && x > 7));
    }
}
