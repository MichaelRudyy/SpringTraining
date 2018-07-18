package robotfolder.partsOfBody.second;

import robotfolder.partsOfBody.interfaces.Hand;
import org.springframework.stereotype.Component;

/**
 * Created by Michael Rudyy on 22-Jun-17.
 */

@Component
public class SecondHand implements Hand {
    public SecondHand() {
    }

    public void action() {
        System.out.println("Second hand action");
    }
}
