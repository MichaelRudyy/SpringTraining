package robot.partsOfBody.first;

import robot.partsOfBody.interfaces.Leg;
import org.springframework.stereotype.Component;

/**
 * Created by Michael Rudyy on 22-Jun-17.
 */

@Component
public class FirstLeg implements Leg {
    public FirstLeg() {
    }

    public void action() {
        System.out.println("First leg action");
    }
}
