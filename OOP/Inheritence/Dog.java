package Inheritence;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String fur;

    public Dog(String name, String color, String species, int weight, int height, int eyes, int legs, int tail,
            int teeth, String fur) {
        super(name, color, species, weight, height);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.fur = fur;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moving(int speed) {
        System.out.println("Dog.moving() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moving(speed);
        super.move(speed);
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getFur() {
        return fur;
    }
}
