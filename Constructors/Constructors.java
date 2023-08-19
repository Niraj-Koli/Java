package Constructors;

public class Constructors {
    public static void main(String[] args) {

        Details alpha = new Details();
        System.out.println("Name: " + alpha.getName());
        System.out.println("Number: " + alpha.getNumber());
        System.out.println("Game: " + alpha.getGame());

        System.out.println();

        Details beta = new Details("Epsilon", 7);
        System.out.println("Name: " + beta.getName());
        System.out.println("Number: " + beta.getNumber());
        System.out.println("Game: " + beta.getGame());

        System.out.println();

        Details gamma = new Details("Burnzy", 2, "Valorant");
        System.out.println("Name: " + gamma.getName());
        System.out.println("Number: " + gamma.getNumber());
        System.out.println("Game: " + gamma.getGame());
    }
}
