package traits;

public class ATrait implements ITrait {
    protected int conBoost;
    protected int strBoost;
    protected int dexBoost;
    protected int intelligenceBoost;
    protected int charismaBoost;
    protected int wisBoost;

    /**
     * get the constitution boost of the trait
     * @return the constitution boost of the trait
     */
    public int getConBoost() {
        return conBoost;
    }

    /**
     * get the strength boost of the trait
     * @return the strength boost of the trait
     */
    public int getStrBoost() {
        return strBoost;
    }

    /**
     * get the dexterity boost of the trait
     * @return the dexterity boost of the trait
     */
    public int getDexBoost() {
        return dexBoost;
    }

    /**
     * get the intelligence boost of the trait
     * @return the intelligence boost of the trait
     */
    public int getIntelligenceBoost() {
        return intelligenceBoost;
    }

    /**
     * get the charisma boost of the trait
     * @return the charisma boost of the trait
     */
    public int getCharismaBoost() {
        return charismaBoost;
    }

    /**
     * get the wisdom boost of the trait
     * @return the wisdom boost of the trait
     */
    public int getWisBoost() {
        return wisBoost;
    }
}
