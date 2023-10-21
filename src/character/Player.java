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

    public void equipWeapon(Weapon w) {
        if (weapon != null) {
            inventory.add(weapon);
            subtractStatsEquipment(weapon);
        }
        weapon = w;
        addStatsEquipment(weapon);
    }

    public void equipHeadpiece(Headpiece hp) {
        if (headpiece != null) {
            inventory.add(headpiece);
            subtractStatsEquipment(headpiece);
        }
        headpiece = hp;
        addStatsEquipment(headpiece);
    }

    public void equipBoots(Boots b) {
        if (boots != null) {
            inventory.add(boots);
            subtractStatsEquipment(boots);
        }
        boots = b;
        addStatsEquipment(boots);
    }

    public void equipBodypiece(Bodypiece bp) {
        if (bodypiece != null) {
            inventory.add(bodypiece);
            subtractStatsEquipment(bodypiece);
        }
        bodypiece = bp;
        addStatsEquipment(bodypiece);
    }

    public void addTrait(ATrait trait){
        traits.add(trait);
        addStatsTrait(trait);
    }

    public void consume(Consumable c){
        addStatsConsumable(c);
    }

    private void subtractStatsEquipment(Equipment equipment){
        this.dex -= equipment.getDexBoost();
        this.str -= equipment.getStrBoost();
        this.con -= equipment.getConBoost();
        this.intelligence -= equipment.getIntelligenceBoost();
        this.charisma -= equipment.getCharismaBoost();
        this.wis -= equipment.getWisBoost();
    }

    private void addStatsEquipment(Equipment equipment){
        this.dex += equipment.getDexBoost();
        this.str += equipment.getStrBoost();
        this.con += equipment.getConBoost();
        this.intelligence += equipment.getIntelligenceBoost();
        this.charisma += equipment.getCharismaBoost();
        this.wis += equipment.getWisBoost();
    }

    private void addStatsConsumable(Consumable consumable){
        this.dex += consumable.getDexBoost();
        this.str += consumable.getStrBoost();
        this.con += consumable.getConBoost();
        this.intelligence += consumable.getIntelligenceBoost();
        this.charisma += consumable.getCharismaBoost();
        this.wis += consumable.getWisBoost();
    }

    private void addStatsTrait(ATrait trait){
        this.dex += trait.getDexBoost();
        this.str += trait.getStrBoost();
        this.con += trait.getConBoost();
        this.intelligence += trait.getIntelligenceBoost();
        this.charisma += trait.getCharismaBoost();
        this.wis += trait.getWisBoost();
    }

    public void addItem(IItem item){
        inventory.add(item);
    }

    public String getName() {
        return name;
    }

    public int getDex() {
        return dex;
    }

    public int getStr() {
        return str;
    }

    public int getCon() {
        return con;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getWis() {
        return wis;
    }

    public void addDex(int dexBoost){
        this.dex += dexBoost;
    }

    public void addStr(int strBoost){
        this.str += strBoost;
    }

    public void addCon(int conBoost){
        this.con += conBoost;
    }

    public void addIntelligence(int intelligenceBoost){
        this.intelligence += intelligenceBoost;
    }

    public void addCharisma(int charismaBoost){
        this.charisma += charismaBoost;
    }

    public void addWis(int wisBoost){
        this.wis += wisBoost;
    }

    public List<IItem> getInventory() {
        return inventory;
    }
}
