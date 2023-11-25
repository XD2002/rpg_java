package items.equipment;

import items.AItem;
import items.IItem;

public abstract class Equipment extends AItem {
    protected int conBoost;
    protected int strBoost;
    protected int dexBoost;
    protected int intelligenceBoost;
    protected int charismaBoost;
    protected int wisBoost;

    /**
     * get the constitution boost of the equipment
     * @return the constitution boost of the equipment
     */
    public int getConBoost() {
        return conBoost;
    }

    /**
     * get the strength boost of the equipment
     * @return the strength boost of the equipment
     */
    public int getStrBoost() {
        return strBoost;
    }

    /**
     * get the dexterity boost of the equipment
     * @return the dexterity boost of the equipment
     */
    public int getDexBoost() {
        return dexBoost;
    }

    /**
     * get the intelligence boost of the equipment
     * @return the intelligence boost of the equipment
     */
    public int getIntelligenceBoost() {
        return intelligenceBoost;
    }

    /**
     * get the charisma boost of the equipment
     * @return the charisma boost of the equipment
     */
    public int getCharismaBoost() {
        return charismaBoost;
    }

    /**
     * get the wisdom boost of the equipment
     * @return the wisdom boost of the equipment
     */
    public int getWisBoost() {
        return wisBoost;
    }
}
