package encounters;

import character.Player;
import structures.RandomPriorityArray;

import javax.swing.*;

public abstract class AEncounter implements IEncounter{

    boolean[] actionsPerformed;
    int numStages;

    public AEncounter(int numStages){
        actionsPerformed = new boolean[numStages];
        this.numStages = numStages;
    }

    /**
     * start the encounter
     * @param player the player who engages in the encounter
     * @param panel the panel of the GUI the encounter has to be displayed on
     * @param stats the stats panel, used to update it's content when needed
     * @param inventory the inventory panel, used to update it's content when needed
     */
    public final void engage(Player player, JPanel panel, JPanel stats, JPanel inventory, RandomPriorityArray<IEncounter> rpa){
        panel.removeAll();
        panel.repaint();
        run(player, panel, stats, inventory);
        while(!actionsPerformed[numStages-1]){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        addNew(rpa);
    }

    public abstract void run(Player player, JPanel panel, JPanel stats, JPanel inventory);

    public void addNew(RandomPriorityArray<IEncounter> rpa){
    }
}
