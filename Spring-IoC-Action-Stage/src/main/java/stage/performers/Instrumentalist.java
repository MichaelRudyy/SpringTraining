package stage.performers;

import stage.instruments.Instrument;

public class Instrumentalist implements Performer{
    private String song;
    private Instrument instrument;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }



    @Override
    public void perform() {
        System.out.println(this + " Playing " + song);
        instrument.play();
    }
}
