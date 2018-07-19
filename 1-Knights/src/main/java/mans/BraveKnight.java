package mans;

import interfaces.Knight;
import interfaces.Quest;

public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    private void embarkOnQuest() {
        quest.embark();
    }

    @Override
    public void action() {
        embarkOnQuest();
    }
}
