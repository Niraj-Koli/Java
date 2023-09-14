package Abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new Dog("Aero");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Perry");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
