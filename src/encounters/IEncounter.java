package encounters;

import character.*;

import javax.swing.*;

public interface IEncounter {
    /**
     * start the encounter
     * @param player the player who engages in the encounter
     * @param panel the panel of the GUI the encounter has to be displayed on
     * @param stats the stats panel, used to update it's content when needed
     * @param inventory the inventory panel, used to update it's content when needed
     */
    public void engage(Player player, JPanel panel, JPanel stats, JPanel inventory);
}
