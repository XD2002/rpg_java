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

    public int getConBoost() {
        return conBoost;
    }

    public int getStrBoost() {
        return strBoost;
    }

    public int getDexBoost() {
        return dexBoost;
    }

    public int getIntelligenceBoost() {
        return intelligenceBoost;
    }

    public int getCharismaBoost() {
        return charismaBoost;
    }

    public int getWisBoost() {
        return wisBoost;
    }
}
