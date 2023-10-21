package tools;

import character.Player;

import java.util.Random;

public final class Dice {

    Random r;

    public Dice() {
        r = new Random();
    }

    private double roll(int medium){
        double d = r.nextGaussian()*2+medium;
        System.out.println("rolled: " + d);
        return d;
    }

    public boolean checkStr(Player player, int strPassValue){
        return roll(player.getStr()) > strPassValue;
    }

    public boolean checkCon(Player player, int conPassValue){
        return roll(player.getCon()) > conPassValue;
    }

    public boolean checkDex(Player player, int dexPassValue){
        return roll(player.getDex()) > dexPassValue;
    }

    public boolean checkIntelligence(Player player, int intelligencePassValue){
        return roll(player.getIntelligence()) > intelligencePassValue;
    }

    public boolean checkCharisma(Player player, int charismaPassValue){
        return roll(player.getCharisma()) > charismaPassValue;
    }

    public boolean checkWis(Player player, int wisPassValue){
        return roll(player.getWis()) > wisPassValue;
    }

    public boolean getBool(){
        return r.nextBoolean();
    }
}
