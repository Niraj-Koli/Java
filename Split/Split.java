package Split;

public class Split {
    public static void main(String[] args) {
        String[] alpha = "You are standing in front of a hill, Wow !!! Whats your next move".split(" ");

        for (String i : alpha) {
            System.out.println(i);
        }

        System.out.println();

        String[] beta = "You are standing in front of a hill, Wow !!! Whats your next move".split(", ");

        for (String i : beta) {
            System.out.println(i);
        }

        System.out.println();

        String[] gamma = "You are standing in front of a hill, Wow !!! Whats your next move".split("!!! ");
        
        for (String i : gamma) {
            System.out.println(i);
        }
    }
}
