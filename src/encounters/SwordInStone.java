package encounters;

import character.Player;
import items.equipment.StoneSword;
import tools.Dice;

import javax.swing.*;
import java.util.Scanner;

public class SwordInStone implements IEncounter{
    /**
     * start the encounter
     * @param player the player who engages in the encounter
     * @param frame the frame of the GUI the encounter has to be displayed on
     */
    @Override
    public void engage(Player player, JFrame frame) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You come across a stone with a sword stuck in it.");
        System.out.println("1. Pull it out (strength roll 7)");
        System.out.println("2. Leave");
        String res = sc.nextLine();
        if (res.equals("1")){
            Dice d = new Dice();
            if (d.checkStr(player, 7)){
                player.addItem(new StoneSword());
                System.out.println("You pull the sword out, you are praised by the crowd.\nYou put the stone sword in your inventory.");
            } else {
                System.out.println("You are not strong enough and give up.");
            }
        } else {
            System.out.println("You leave");
        }
    }
}
