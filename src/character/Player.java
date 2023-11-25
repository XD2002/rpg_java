package character;

import items.*;
import items.consumables.Consumable;
import items.equipment.*;
import traits.ATrait;
import traits.ITrait;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private int dex;
    private int str;
    private int con;
    private int intelligence;
    private int charisma;
    private int wis;
    private int maxHp;
    private int currentHp;

    private final List<ITrait> traits;

    private final List<IItem> inventory;
    private Weapon weapon;
    private Headpiece headpiece;
    private Boots boots;
    private Bodypiece bodypiece;

    /**
     * Constructor for a Player entity
     * @param name the name of the player
     * @param dex the starting dexterity value of the player
     * @param str the starting strength value of the player
     * @param con the starting constitution value of the player
     * @param intelligence the starting intelligence value of the player
     * @param charisma the starting charisma value of the player
     * @param wis the starting wisdom value of the player
     */
    public Player(String name, int dex, int str, int con, int intelligence, int charisma, int wis) {
        this.name = name;
        this.traits = new ArrayList<>();
        this.inventory = new ArrayList<>();
        this.dex = dex;
        this.str = str;
        this.con = con;
        this.intelligence = intelligence;
        this.charisma = charisma;
        this.wis = wis;
        this.maxHp = 5;
    }

    /**
     * equips a weapon
     * @param w the weapon to equip
     */
    public void equipWeapon(Weapon w) {
        if (weapon != null) {
            inventory.add(weapon);
            subtractStatsEquipment(weapon);
        }
        weapon = w;
        addStatsEquipment(weapon);
    }

    /**
     * equips a headpiece
     * @param hp the headpiece to equip
     */
    public void equipHeadpiece(Headpiece hp) {
        if (headpiece != null) {
            inventory.add(headpiece);
            subtractStatsEquipment(headpiece);
        }
        headpiece = hp;
        addStatsEquipment(headpiece);
    }

    /**
     * equips boots
     * @param b the boots to equip
     */
    public void equipBoots(Boots b) {
        if (boots != null) {
            inventory.add(boots);
            subtractStatsEquipment(boots);
        }
        boots = b;
        addStatsEquipment(boots);
    }

    /**
     * equips a bodypiece
     * @param bp the bodypiece to equip
     */
    public void equipBodypiece(Bodypiece bp) {
        if (bodypiece != null) {
            inventory.add(bodypiece);
            subtractStatsEquipment(bodypiece);
        }
        bodypiece = bp;
        addStatsEquipment(bodypiece);
    }

    /**
     * adds a trait to the player
     * @param trait the trait to add
     */
    public void addTrait(ATrait trait){
        traits.add(trait);
        addStatsTrait(trait);
    }

    /**
     * consumes a consumable
     * @param c the consumable to cosume
     */
    public void consume(Consumable c){
        addStatsConsumable(c);
    }

    /**
     * subtracts the stats of a piece of equipment from the stats of the player
     * @param equipment the piece of equipment to remove the stats for
     */
    private void subtractStatsEquipment(Equipment equipment){
        this.dex -= equipment.getDexBoost();
        this.str -= equipment.getStrBoost();
        this.con -= equipment.getConBoost();
        this.intelligence -= equipment.getIntelligenceBoost();
        this.charisma -= equipment.getCharismaBoost();
        this.wis -= equipment.getWisBoost();
    }

    /**
     * adds the stats of a piece of equipment to the stats of the player
     * @param equipment the piece of equipment to add the stats for
     */
    private void addStatsEquipment(Equipment equipment){
        addStats(equipment.getDexBoost(), equipment.getStrBoost(), equipment.getConBoost(), equipment.getIntelligenceBoost(), equipment.getCharismaBoost(), equipment.getWisBoost());
    }

    /**
     * adds the stats of a consumable to the stats of the player
     * @param consumable the consumable to add the stats for
     */
    private void addStatsConsumable(Consumable consumable){
        addStats(consumable.getDexBoost(), consumable.getStrBoost(), consumable.getConBoost(), consumable.getIntelligenceBoost(), consumable.getCharismaBoost(), consumable.getWisBoost());
    }

    /**
     * adds the stats of a trait to the stats of the player
     * @param trait the trait to add the stats for
     */
    private void addStatsTrait(ATrait trait){
        addStats(trait.getDexBoost(), trait.getStrBoost(), trait.getConBoost(), trait.getIntelligenceBoost(), trait.getCharismaBoost(), trait.getWisBoost());
    }

    /**
     * adds stats to the player
     * @param dexBoost dexterity to add to the player
     * @param strBoost strength to add to the player
     * @param conBoost constitution to add to the player
     * @param intelligenceBoost intelligence to add to the player
     * @param charismaBoost charisma to add to the player
     * @param wisBoost wisdom to add to the player
     */
    private void addStats(int dexBoost, int strBoost, int conBoost, int intelligenceBoost, int charismaBoost, int wisBoost) {
        this.dex += dexBoost;
        this.str += strBoost;
        this.con += conBoost;
        this.intelligence += intelligenceBoost;
        this.charisma += charismaBoost;
        this.wis += wisBoost;
    }

    /**
     * adds an item to the inventory of the player
     * @param item the item ot add to the inventory
     */
    public void addItem(IItem item){
        inventory.add(item);
    }

    /**
     * get the name of the player
     * @return the name of the player
     */
    public String getName() {
        return name;
    }

    /**
     * get the dexterity of the player
     * @return the dexterity of the player
     */
    public int getDex() {
        return dex;
    }

    /**
     * get the strength of the player
     * @return the strength of the player
     */
    public int getStr() {
        return str;
    }

    /**
     * get the constitution of the player
     * @return the constitution of the player
     */
    public int getCon() {
        return con;
    }

    /**
     * get the intelligence of the player
     * @return the intelligence of the player
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * get the charisma of the player
     * @return the charisma of the player
     */
    public int getCharisma() {
        return charisma;
    }

    /**
     * get the wisdom of the player
     * @return the wisdom of the player
     */
    public int getWis() {
        return wis;
    }

    /**
     * adds dexterity to the player
     * @param dexBoost the amount of dexterity to add
     */
    public void addDex(int dexBoost){
        this.dex += dexBoost;
    }

    /**
     * adds strength to the player
     * @param strBoost the amount of strength to add
     */
    public void addStr(int strBoost){
        this.str += strBoost;
    }

    /**
     * adds constitution to the player
     * @param conBoost the amount of constitution to add
     */
    public void addCon(int conBoost){
        this.con += conBoost;
    }

    /**
     * adds intelligence to the player
     * @param intelligenceBoost the amount of intelligence to add
     */
    public void addIntelligence(int intelligenceBoost){
        this.intelligence += intelligenceBoost;
    }

    /**
     * adds charisma to the player
     * @param charismaBoost the amount of charisma to add
     */
    public void addCharisma(int charismaBoost){
        this.charisma += charismaBoost;
    }

    /**
     * adds wisdom to the player
     * @param wisBoost the amount of wisdom to add
     */
    public void addWis(int wisBoost){
        this.wis += wisBoost;
    }

    /**
     * get the inventory of the player
     * @return the inventory of the player
     */
    public List<IItem> getInventory() {
        return inventory;
    }
}
