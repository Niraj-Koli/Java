package OOPs;

public class OOPs {
    public static void main(String[] args) {

        HamBurger hamburger = new HamBurger("Basic", "Chicken", 100, "Brown Bread");
        System.out.println(":::::Basic Burger:::::");
        hamburger.addHamburgerAddition1("Tomato", 15.5);
        hamburger.addHamburgerAddition2("Lettuce", 5.7);
        hamburger.addHamburgerAddition3("Cheese", 20.4);
        hamburger.addHamburgerAddition4("Mayonnaise", 17.2);
        System.out.println("Total Burger Price is " + hamburger.itemizeHamburger());

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Healthy", "Bacon", 50, "White Bread");
        System.out.println(":::::Healthy Burger:::::");
        healthyBurger.addHealthAddition1("Sauce", 5.8);
        healthyBurger.addHealthAddition2("Mojito", 25.5);
        System.out.println("Total Burger Price is " + healthyBurger.itemizeHamburger());

        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println(":::::Deluxe Burger:::::");
        System.out.println("Total Burger Prize is " + deluxeBurger.itemizeHamburger());
        deluxeBurger.addHamburgerAddition1("Cheese", 1.5);
    }
}
