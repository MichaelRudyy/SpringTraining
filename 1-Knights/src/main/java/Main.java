import config.KnightConfiguration;
import interfaces.Knight;
import mans.Minstrel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(KnightConfiguration.class);
        ApplicationContext aspectContext = new ClassPathXmlApplicationContext("aspectContext.xml");
        Minstrel minstrel = (Minstrel) aspectContext.getBean("minstrel");
        minstrel.afterQuest();
        Knight knight = (Knight) context.getBean("knight");
        knight.action();
    }
}
