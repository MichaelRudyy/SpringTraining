package robotfolder.partsOfBody.second;

import robotfolder.partsOfBody.interfaces.Leg;
import org.springframework.stereotype.Component;

/**
 * Created by Michael Rudyy on 22-Jun-17.
 */

@Component
public class SecondLeg implements Leg {
    public SecondLeg() {
    }

    public void action() {
        System.out.println("Second leg action");
    }
}
