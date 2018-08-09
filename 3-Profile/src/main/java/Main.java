import database.Magic;
import database.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        /*        context.getEnvironment().setActiveProfiles("tom");*/

        context.scan("database");
        context.refresh();

/*        context.getEnvironment().setActiveProfiles("tom");
        for (String str:context.getEnvironment().getActiveProfiles()) {
            System.out.println(str);
        }
        context.register(User.class);
        context.refresh();
        context.close();*/


/*        User user = (User) context.getBean("bob");
        System.out.println(user);*/

        Magic magic = (Magic) context.getBean("magic");
    }
}