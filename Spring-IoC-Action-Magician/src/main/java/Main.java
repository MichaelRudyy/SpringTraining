import method_inject.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import read_method_inject.Instrumentalist;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Performer magician = (Performer) context.getBean("harry");

        magician.perform();

        Instrumentalist instrumentalist = (Instrumentalist) context.getBean("stevie");

/**
 *      http://www.javarticles.com/2015/05/spring-lookup-method-example.html
 */

        System.out.println(instrumentalist.getMagician());
        System.out.println(magician);
        instrumentalist.perform();
    }
}
