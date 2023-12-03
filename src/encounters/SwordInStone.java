package encounters;

import character.Player;
import items.equipment.StoneSword;
import structures.RandomPriorityArray;
import tools.Dice;
import tools.UIMaker;

import javax.swing.*;
import java.util.Scanner;

public class SwordInStone extends AEncounter{

    public SwordInStone(int numStages) {
        super(numStages);
    }

    @Override
    public void run(Player player, JPanel panel, JPanel stats, JPanel inventory) {
        panel.add(new JTextArea("You come across a stone with a sword stuck in it."));
        JButton pullBtn = new JButton("Pull it out (strength roll 7)");
        pullBtn.addActionListener(e -> pull(player, panel, inventory));
        panel.add(pullBtn);
        JButton leaveBtn = new JButton("Leave");
        leaveBtn.addActionListener(e -> leave(panel));
        panel.add(leaveBtn);
        panel.revalidate();
    }

    private void pull(Player player, JPanel panel, JPanel inventory){
        if(!actionsPerformed[0]){
            Dice d = new Dice();
            if(d.checkStr(player, 7)){
                player.addItem(new StoneSword());
                panel.add(new JTextArea("You pull the sword out, you are praised by the crowd.\nYou put the stone sword in your inventory."));
            } else {
                panel.add(new JTextArea("You are not strong enough and give up."));
            }
            UIMaker.makeBigInventoryPanel(player,inventory);
            panel.revalidate();
            actionsPerformed[0] = true;
        }
    }

    private void leave(JPanel panel){
        if(!actionsPerformed[0]){
            panel.add(new JTextArea("You leave"));
            panel.revalidate();
            actionsPerformed[0] = true;
        }
    }

    @Override
    public void addNew(RandomPriorityArray<IEncounter> rpa){
        rpa.add(new SwordInStone(1),   0);
    }
}
