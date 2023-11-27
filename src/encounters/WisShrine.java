package encounters;

import java.util.Scanner;

import character.*;
import tools.UIMaker;

import javax.swing.*;

public class WisShrine extends AEncounter{
    /**
     * start the encounter
     * @param player the player who engages in the encounter
     * @param panel the panel of the GUI the encounter has to be displayed on
     * @param stats the stats panel, used to update it's content when needed
     * @param inventory the inventory panel, used to update it's content when needed
     */
    @Override
    public void engage(Player player, JPanel panel, JPanel stats, JPanel inventory) {
        panel.removeAll();
        panel.add(new JTextArea("You encounter a shrine of wisdom, what do you want to do?"));
        JButton prayBtn = new JButton("Pray");
        prayBtn.addActionListener(e ->
            pray(player, panel, stats)
        );
        panel.add(prayBtn);
        JButton leaveBtn = new JButton("Leave");
        leaveBtn.addActionListener(e ->
            leave(panel)
        );
        panel.add(leaveBtn);
        panel.revalidate();
    }

    private void pray(Player player, JPanel panel, JPanel stats){
        if(!actionsPerformed[0]){
            player.addWis(1);
            UIMaker.makeStatPanel(player, stats);
            panel.add(new JTextArea("You prayed at the shrine, you wisdom increased by 1"));
            panel.revalidate();
            actionsPerformed[0] = true;
        }
    }

    private void leave(JPanel panel){
        if(!actionsPerformed[0]){
            panel.add(new JTextArea("You leave the shrine behind"));
            actionsPerformed[0] = true;
        }
    }
}
