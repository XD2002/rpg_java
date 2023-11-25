package tools;

import character.Player;
import items.DefaultItem;
import items.IItem;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public final class UIMaker {

    public static JPanel itemPanel;

    /**
     * makes the statistics panel
     * @param player the player object
     * @param panel the panel to draw on
     */
    public static void makeStatPanel(Player player, JPanel panel){
        panel.removeAll();
        panel.setLayout(new GridLayout(7,1));
        panel.add(new JLabel("NAME: " + player.getName()));
        panel.add(new JLabel("DEX: " + player.getDex()));
        panel.add(new JLabel("STR: " + player.getStr()));
        panel.add(new JLabel("CON: " + player.getCon()));
        panel.add(new JLabel("INT: " + player.getIntelligence()));
        panel.add(new JLabel("CHA: " + player.getCharisma()));
        panel.add(new JLabel("WIS: " + player.getWis()));
    }

    /**
     * makes the image panel
     * @param player the player object
     * @param panel the panel to draw on
     */
    public static void makeImagePanel(Player player, JPanel panel){
        panel.removeAll();
        panel.setLayout(new GridLayout(1,1));
        panel.add(new JLabel(player.getName() + " IMAGE"));
    }

    /**
     * makes the big inventory panel
     * @param player the player object
     * @param panel the panel to draw on
     */
    public static void makeBigInventoryPanel(Player player, JPanel panel){
        panel.removeAll();

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = GridBagConstraints.REMAINDER;

        panel.setLayout(gbl);
        c.weighty = 0.25;
        c.gridy = 0;
        itemPanel = new JPanel();
        itemPanel.setLayout(new GridLayout(2,1));
        itemPanel.add(new JLabel("foo"));
        itemPanel.add(new JLabel("bar"));
        gbl.setConstraints(itemPanel, c);
        panel.add(itemPanel);
        c.weighty = 0.75;
        c.gridy = 1;
        JPanel invPanel = new JPanel();
        makeInventoryPanel(player, invPanel, itemPanel);
        gbl.setConstraints(invPanel, c);
        panel.add(invPanel);
    }

    /**
     * makes the smaller inventory panel
     * @param player the player object
     * @param panel the panel to draw on
     */
    private static void makeInventoryPanel(Player player, JPanel panel, JPanel itemPanel){
        panel.removeAll();
        panel.setLayout(new GridLayout(5, 3));

        List<IItem> inventory = player.getInventory();
        int emptyCellsToAdd = 15 - inventory.size();

        for(IItem item : inventory){
            JButton button = new JButton(item.getName());
            button.addActionListener(e -> showItem(item, itemPanel));
            panel.add(button);
        }

        for (int i = 0; i<emptyCellsToAdd;i++){
            JButton button = new JButton();
            button.addActionListener(e -> showItem(new DefaultItem(), itemPanel));
            panel.add(button);
        }
    }

    /**
     * adds an item to the item panel
     * @param item the item to add
     * @param itemPanel the item panel
     */
    private static void showItem(IItem item, JPanel itemPanel){
        itemPanel.removeAll();
        itemPanel.revalidate();
        itemPanel.repaint();
        itemPanel.add(new JLabel(item.getName()));
        itemPanel.add(new JLabel(item.getDescription()));
    }
}
