package tools;

import character.Player;

import java.util.Random;

public final class Dice {

    Random r;

    /**
     * constructor for a dice
     */
    public Dice() {
        r = new Random();
    }

    /**
     * gives a random value from a Gaussian distribution
     * @param medium the medium value of the Gaussian distribution
     * @return a random value from a Gaussian distribution
     */
    private double roll(int medium){
        double d = r.nextGaussian()*2+medium;
        System.out.println("rolled: " + d);
        return d;
    }

    /**
     * check if the player passes a strength check
     * @param player the player
     * @param strPassValue the value to pass the check
     * @return boolean indicating whether the check is passed or not
     */
    public boolean checkStr(Player player, int strPassValue){
        return roll(player.getStr()) > strPassValue;
    }

    /**
     * check if the player passes a constitution check
     * @param player the player
     * @param conPassValue the value to pass the check
     * @return boolean indicating whether the check is passed or not
     */
    public boolean checkCon(Player player, int conPassValue){
        return roll(player.getCon()) > conPassValue;
    }

    /**
     * check if the player passes a dexterity check
     * @param player the player
     * @param dexPassValue the value to pass the check
     * @return boolean indicating whether the check is passed or not
     */
    public boolean checkDex(Player player, int dexPassValue){
        return roll(player.getDex()) > dexPassValue;
    }

    /**
     * check if the player passes an intelligence check
     * @param player the player
     * @param intelligencePassValue the value to pass the check
     * @return boolean indicating whether the check is passed or not
     */
    public boolean checkIntelligence(Player player, int intelligencePassValue){
        return roll(player.getIntelligence()) > intelligencePassValue;
    }

    /**
     * check if the player passes a charisma check
     * @param player the player
     * @param charismaPassValue the value to pass the check
     * @return boolean indicating whether the check is passed or not
     */
    public boolean checkCharisma(Player player, int charismaPassValue){
        return roll(player.getCharisma()) > charismaPassValue;
    }

    /**
     * check if the player passes a wisdom check
     * @param player the player
     * @param wisPassValue the value to pass the check
     * @return boolean indicating whether the check is passed or not
     */
    public boolean checkWis(Player player, int wisPassValue){
        return roll(player.getWis()) > wisPassValue;
    }

    /**
     * gives a random boolean
     * @return random boolean
     */
    public boolean getBool(){
        return r.nextBoolean();
    }
}
