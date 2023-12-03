package encounters;

import java.util.Scanner;

import character.*;
import structures.RandomPriorityArray;
import tools.UIMaker;

import javax.swing.*;

public class WisShrine extends AEncounter{

    public WisShrine(int numStages) {
        super(numStages);
    }

    @Override
    public void run(Player player, JPanel panel, JPanel stats, JPanel inventory) {
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
            panel.add(new JTextArea("You prayed at the shrine, your wisdom increased by 1"));
            panel.revalidate();
            super.actionsPerformed[0] = true;
        }
    }

    private void leave(JPanel panel){
        if(!actionsPerformed[0]){
            panel.add(new JTextArea("You leave the shrine behind"));
            panel.revalidate();
            super.actionsPerformed[0] = true;
        }
    }

    @Override
    public void addNew(RandomPriorityArray<IEncounter> rpa){
        rpa.add(new WisShrine(1), 2);
    }
}
