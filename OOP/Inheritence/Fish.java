package Inheritence;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, String color, String species, int weight, int height, int gills, int eyes, int fins) {
        super(name, color, species, weight, height);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {
        System.out.println("fish.rest() called");
    }

    public void swim(int speed) {
        System.out.println("fish.swim() called\n" +
                "Fish in moving at " + speed);
        move(90);
    }

    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}
