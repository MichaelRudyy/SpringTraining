package robotfolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import robotfolder.partsOfBody.PartsConfiguration;

/**
 * Created by Michael Rudyy on 22-Jun-17.
 */

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RobotConfiguration.class, PartsConfiguration.class);
        Robot robot = (Robot) context.getBean("robotFSF");
        System.out.println("");
        robot.action();
    }
}
