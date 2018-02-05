package robot.partsOfBody.first;

import robot.partsOfBody.interfaces.Head;
import org.springframework.stereotype.Component;

/**
 * Created by Michael Rudyy on 22-Jun-17.
 */

@Component
public class FirstHead implements Head {

    public FirstHead() {
    }

    public void action() {
        System.out.println("First head action");
    }
}
