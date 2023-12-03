import character.Player;
import encounters.IEncounter;
import items.consumables.TomaatGroenteSoep;
import items.equipment.WoodenSword;
import structures.RandomPriorityArray;
import tools.RPAFiller;
import tools.UIMaker;

import javax.swing.*;
import java.awt.*;

public class Main {

    static boolean block;

    static GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];

    public static void main(String[] args){

        Player player = new Player("Doddy", 6, 6, 6, 6, 6,  6);

        player.addItem(new WoodenSword());
        player.addItem(new TomaatGroenteSoep());

        JFrame frame = new JFrame("RPG");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        device.setFullScreenWindow(frame);
        frame.repaint();
        frame.revalidate();
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

        mainPane.add(gamePane, BorderLayout.CENTER);

        JPanel inventoryPane = new JPanel();
        UIMaker.makeBigInventoryPanel(player, inventoryPane);
        mainPane.add(inventoryPane, BorderLayout.EAST);

        frame.add(mainPane);
        /*
        frame.setMinimumSize(new Dimension(1300,700));
        frame.setPreferredSize(new Dimension(1300, 700));
        frame.pack();
        frame.setLocationRelativeTo(null);*/
        frame.setVisible(true);

        RandomPriorityArray<IEncounter> rpa = RPAFiller.getDefault();

        while(!rpa.isEmpty()){
            block = true;
            IEncounter encounter = rpa.getRandomAndDelete();
            encounter.engage(player,gamePane,stats,inventoryPane,rpa);

            JButton nextBtn = new JButton("Next");
            nextBtn.addActionListener(e -> next());
            gamePane.add(nextBtn);
            gamePane.revalidate();
            while(block){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static void next(){
        block = false;
    }
}