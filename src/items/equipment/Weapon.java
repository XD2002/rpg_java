package items.equipment;

public abstract class Weapon extends Equipment {

    //0: physical
    //1: fire
    protected int[] elementalStrength = new int[]{0,0};

    public int[] getElementalStrength(){
        return elementalStrength;
    }
}
