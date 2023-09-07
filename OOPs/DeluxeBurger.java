package OOPs;

public class DeluxeBurger extends HamBurger {
    public DeluxeBurger() {
        super("Deluxe", "Chicken, Sasuge and Bacon", 300, "Orange Bread");
        super.addHamburgerAddition1("Potato Fries", 50);
        super.addHamburgerAddition2("Coke", 100);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
