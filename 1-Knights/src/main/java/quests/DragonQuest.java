package quests;

import interfaces.Quest;

public class DragonQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Death to the Dragon!");
    }
}
