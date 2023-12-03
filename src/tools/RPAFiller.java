package tools;

import encounters.IEncounter;
import encounters.SwordInStone;
import encounters.WisShrine;
import structures.RandomPriorityArray;

public class RPAFiller {
    public static RandomPriorityArray<IEncounter> getDefault(){
        RandomPriorityArray<IEncounter> rpa = new RandomPriorityArray<>(5);
        rpa.add(new SwordInStone(1), 0);
        rpa.add(new WisShrine(1), 2);
        return rpa;
    }
}
