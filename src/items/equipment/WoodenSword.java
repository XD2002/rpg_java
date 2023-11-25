package items.equipment;

public class WoodenSword extends Weapon {
    /**
     * constructor for a wooden sword
     */
    public WoodenSword() {
        this.strBoost = 1;
        this.name = "Wooden sword";
        this.description = "A simple wooden sword";
        this.elementalStrength[0] = 1;
    }
}
