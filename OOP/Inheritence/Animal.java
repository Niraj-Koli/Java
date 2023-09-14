package Inheritence;

public class Animal {
    private String name;
    private String color;
    private String species;
    private int weight;
    private int height;

    public Animal(String name, String color, String species, int weight, int height) {
        this.name = name;
        this.color = color;
        this.species = species;
        this.weight = weight;
        this.height = height;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }

    public void move(int speed) {
        System.out.println("Animal.move() called\n" +
                "Animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSpecies() {
        return species;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
