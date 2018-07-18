package robotfolder.partsOfBody.first;

import robotfolder.partsOfBody.interfaces.Hand;
import org.springframework.stereotype.Component;

/**
 * Created by Michael Rudyy on 22-Jun-17.
 */

@Component
public class FirstHand implements Hand {
    public FirstHand() {
    }

    public void action() {
        System.out.println("First hand action");
    }
}
