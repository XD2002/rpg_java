package encounters;

import java.util.Scanner;

import character.*;

import javax.swing.*;

public class WisShrine implements IEncounter {
    /**
     * start the encounter
     * @param player the player who engages in the encounter
     * @param frame the frame of the GUI the encounter has to be displayed on
     */
    @Override
    public void engage(Player player, JFrame frame){
        Scanner sc = new Scanner(System.in);
        System.out.println("You encounter a shrine of wisdom, what do you want to do?");
        System.out.println("1. Pray");
        System.out.println("2. Leave");
        String res = sc.nextLine();
        if (res.equals("1")){
            player.addWis(1);
        }
    }
}
