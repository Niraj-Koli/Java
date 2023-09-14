package Encapsulation;

public class Player {
    private String name;
    private int hitPoints = 70;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;

        if (this.hitPoints <= 0) {
            System.out.println("Player Knocked Out.");
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }
}
