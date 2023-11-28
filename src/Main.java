import character.Player;
import encounters.AEncounter;
import encounters.SwordInStone;
import encounters.WisShrine;
import items.consumables.TomaatGroenteSoep;
import items.equipment.WoodenSword;
import structures.RandomPriorityArray;
import tools.UIMaker;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        RandomPriorityArray<String> rpa = new RandomPriorityArray<>(10);
        rpa.add("Winter", 0);
        rpa.add("Yoohyeon", 8);

        int winter = 0;
        int yoohyeon = 0;
        for(int i=0; i<10000; i++){
            String n = rpa.getRandom();
            if(n.equals("Winter")){
                winter++;
            }
            if(n.equals("Yoohyeon")){
                yoohyeon++;
            }
        }

        System.out.println("Winter: " + winter);
        System.out.println("Yoohyeon: " + yoohyeon);

        /*
        Player player = new Player("Doddy", 6, 6, 6, 6, 6,  6);

        player.addItem(new WoodenSword());
        player.addItem(new TomaatGroenteSoep());

        JFrame frame = new JFrame("RPG");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        JPanel mainPane = new JPanel();

        mainPane.setLayout(new GridLayout(1, 3));

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        JPanel characterPane = new JPanel();
        characterPane.setLayout(gbl);
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.weightx = 1.0;
        c.weighty = 0.25;
        JPanel characterImage = new JPanel();
        UIMaker.makeImagePanel(player, characterImage);
        gbl.setConstraints(characterImage, c);
        characterPane.add(characterImage);

        c.weighty = 0.75;
        c.gridy = 1;
        JPanel stats = new JPanel();
        UIMaker.makeStatPanel(player, stats);
        gbl.setConstraints(stats, c);
        characterPane.add(stats);

        mainPane.add(characterPane, BorderLayout.WEST);

        JPanel gamePane = new JPanel();
        gamePane.setLayout(new GridLayout(11,1));

        //JPanel encounterPanel = new JPanel();
        //gamePane.add(encounterPanel);

        mainPane.add(gamePane, BorderLayout.CENTER);

        JPanel inventoryPane = new JPanel();
        UIMaker.makeBigInventoryPanel(player, inventoryPane);
        mainPane.add(inventoryPane, BorderLayout.EAST);

        frame.add(mainPane);

        frame.setMinimumSize(new Dimension(1300,700));
        //frame.setMaximumSize(new Dimension(1300,700));
        //frame.setSize(1300,700);
        frame.setPreferredSize(new Dimension(1300, 700));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        AEncounter encounter = new WisShrine();
        encounter.engage(player,gamePane,stats,inventoryPane);*/
    }
}