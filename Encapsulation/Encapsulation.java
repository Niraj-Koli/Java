package Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        Player player = new Player("Burnzy", 70, "Katana");

        System.out.println("Player: ");
        System.out.println("Nick: " + player.getName());
        System.out.println("Weapon: " + player.getWeapon());
        System.out.println("Initial Health = " + player.getHealth());

        player.loseHealth(40);
        System.out.println("First Damage = " + player.getHealth());

        int damage = 60;
        System.out.println("Second Damage = " + damage);
        player.loseHealth(60);
    }
}
