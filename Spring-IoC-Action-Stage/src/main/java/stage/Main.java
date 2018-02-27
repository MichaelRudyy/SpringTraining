package stage;

import stage.building.Auditorium;
import stage.performers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");

        Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");

        Performer performer = (Performer) ctx.getBean("taylor");
        performer.perform();
    }
}
