package method_inject;

public class Magician implements Performer {
    private MagicBox magicBox;
    private String magicWords;

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    @Override
    public void perform() {
        System.out.println(magicWords);
        System.out.println("The magic box contains ... ");
        System.out.println(magicBox.getContents());
    }
}
