package items.consumables;

import items.AItem;
import items.IItem;

public abstract class Consumable extends AItem {
    protected int conBoost;
    protected int strBoost;
    protected int dexBoost;
    protected int intelligenceBoost;
    protected int charismaBoost;
    protected int wisBoost;

    /**
     * get the constitution boost of the consumable
     * @return the constitution boost of the consumable
     */
    public int getConBoost() {
        return conBoost;
    }

    /**
     * get the strength boost of the consumable
     * @return the strength boost of the consumable
     */
    public int getStrBoost() {
        return strBoost;
    }

    /**
     * get the dexterity boost of the consumable
     * @return the dexterity boost of the consumable
     */
    public int getDexBoost() {
        return dexBoost;
    }

    /**
     * get the intelligence boost of the consumable
     * @return the intelligence boost of the consumable
     */
    public int getIntelligenceBoost() {
        return intelligenceBoost;
    }

    /**
     * get the charisma boost of the consumable
     * @return the charisma boost of the consumable
     */
    public int getCharismaBoost() {
        return charismaBoost;
    }

    /**
     * get the wisdom boost of the consumable
     * @return the wisdom boost of the consumable
     */
    public int getWisBoost() {
        return wisBoost;
    }
}
