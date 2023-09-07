package Overloading;

public class Overloading {
    public static int calculatePoints(String name, int points) {
        System.out.println("Player " + name + " scored " + points + " points in the game.");
        return points * 100;
    }

    public static void calculatePoints(int points) {
        System.out.println("Unnamed player scored " + points + " points in the game.");
    }

    public static void calculatePoints() {
        System.out.println("Not a single player scored points in the game.");
    }

    public static void main(String[] args) {
        int total = calculatePoints("Kaizer", 700);
        System.out.println("Total points = " + total);

        calculatePoints(500);

        calculatePoints();
    }
}
