package Inheritence;

public class Inheritence {
    public static void main(String[] args) {
        Animal eagle = new Animal("Altair", "Golden", "Philippines", 35, 50);
        System.out.println("Animal: Eagle.");
        System.out.println("Name: " + eagle.getName());
        System.out.println("Color: " + eagle.getColor());
        System.out.println("Species: " + eagle.getSpecies());
        System.out.println("Weight: " + eagle.getWeight());
        System.out.println("Height: " + eagle.getHeight());

        System.out.println();

        Dog dog = new Dog("Aero", "White", "Husky", 27, 15, 2, 4, 1, 20, "Black and White");
        System.out.println("Animal: Dog");
        System.out.println("Name: " + dog.getName());
        System.out.println("Color: " + dog.getColor());
        System.out.println("Species: " + dog.getSpecies());
        System.out.println("Weight: " + dog.getWeight());
        System.out.println("Height: " + dog.getHeight());
        System.out.println("Eyes: " + dog.getEyes());
        System.out.println("Legs: " + dog.getLegs());
        System.out.println("Tail: " + dog.getTail());
        System.out.println("Teeth: " + dog.getTeeth());
        System.out.println("Fur: " + dog.getFur());

        System.out.println();

        dog.eat();
        dog.walk();
        dog.run();
        dog.move(7);

        System.out.println();

        Fish fish = new Fish("Kolden", "Red and White", "Clownfish", 4, 6, 50, 2, 13);
        System.out.println("Animal: Fish");
        System.out.println("Name: " + fish.getName());
        System.out.println("Color: " + fish.getColor());
        System.out.println("Species: " + fish.getSpecies());
        System.out.println("Weight: " + fish.getWeight());
        System.out.println("Height: " + fish.getHeight());
        System.out.println("Gills: " + fish.getGills());
        System.out.println("Eyes: " + fish.getEyes());
        System.out.println("Fins: " + fish.getFins());

        System.out.println();

        fish.rest();
        fish.swim(17);

    }
}
