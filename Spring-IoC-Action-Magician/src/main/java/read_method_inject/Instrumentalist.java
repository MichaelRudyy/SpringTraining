package read_method_inject;

import method_inject.Magician;
import method_inject.Performer;

public abstract class Instrumentalist implements Performer {
    private String song;

    public void setSong(String song) {
        this.song = song;
    }


    @Override
    public void perform() {
        System.out.println(this + " Playing " + song);
    }

    public abstract Magician getMagician();
}
