package stage.performers;

import stage.instruments.Instrument;

import java.util.Collection;

public class OneManBand implements Performer {
    private Collection<Instrument> instruments;
    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }

    @Override
    public void perform() {

        System.out.println(this + " Playing " + song);

        System.out.println(this + " play on ");

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
