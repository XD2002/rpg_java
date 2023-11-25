package items.equipment;

public class StoneSword extends Weapon {
    /**
     * constructor for a stone sword
     */
    public StoneSword(){
        this.strBoost = 2;
        this.name = "Stone sword";
        this.description = "This is a sword pulled out of a sword";
        this.elementalStrength[0] = 1;
    }
}
