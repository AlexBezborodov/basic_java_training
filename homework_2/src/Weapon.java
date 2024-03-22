public class Weapon {
    String name;
    private int hitPoints;

    public Weapon(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public int makeHit() {
        return hitPoints;
    }
}
