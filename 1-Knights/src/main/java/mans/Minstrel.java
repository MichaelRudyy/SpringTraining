package mans;

public class Minstrel {
    private String name;

    Minstrel(String name){
        this.name = name;
    }

    Minstrel(){
        this.name = "Unknown teller";
    }

    public void beforeQuest(){
        System.out.println("before Quest! - " + name);
    }

    public void afterQuest(){
        System.out.println("after Quest! - " + name);
    }
}
