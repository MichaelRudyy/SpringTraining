package robot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import robot.partsOfBody.PartsConfiguration;

/**
 * Created by Michael Rudyy on 22-Jun-17.
 */

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RobotConfiguration.class, PartsConfiguration.class);
        Robot robot = (Robot) context.getBean("robot");
        System.out.println("");
        robot.action();
    }
}
