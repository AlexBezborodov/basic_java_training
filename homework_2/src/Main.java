public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon("Sword", 15);
        Weapon bowAndArrows = new Weapon("BowAndArrows", 20);

        Character knight = new Character("Knight", 100, sword);
        Character elf = new Character("Elf", 100, bowAndArrows);

        System.out.println("Fight 1");
        elf.fight(knight);

        System.out.println("Fight 2");
        elf.fight(knight);
    }
}
