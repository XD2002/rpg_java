package encounters;

import character.*;

import javax.swing.*;

public interface IEncounter {
    /**
     * start the encounter
     * @param player the player who engages in the encounter
     * @param frame the frame of the GUI the encounter has to be displayed on
     */
    public void engage(Player player, JFrame frame);
}
