public class Character {
    private final String name;
    private int health;
    private Weapon weapon;

    public Character(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void increaseHealth(int points) {
        health += points;
    }

    public int fight(Character opponent) {
        System.out.println(name + " wants to fight...");
        if (opponent.weapon == null) {
            System.out.println(opponent.name + " has no weapon and is running away...");
            return 0;
        }

        System.out.println(name + " uses special skill and increases health by 10 points");
        increaseHealth(10);

        int hitPoints = weapon.makeHit();
        System.out.println("Makes a hit with " + weapon.name);
        opponent.health -= hitPoints;
        System.out.println(opponent.name + " loses " + hitPoints + " health points");
        System.out.println(opponent.name + " remaining health is " + opponent.health);
        return opponent.health;
    }
}

