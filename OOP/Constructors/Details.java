package Constructors;

public class Details {
    private String name;
    private int number;
    private String game;

    public Details() {
        this("Kaizer", 10, "Counter Strike");
    }

    public Details(String name, int number) {
        this(name, number, "Apex Legends");
    }

    public Details(String name, int number, String game) {
        this.name = name;
        this.number = number;
        this.game = game;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getGame() {
        return game;
    }
}
