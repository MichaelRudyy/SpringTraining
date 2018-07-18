package robotfolder.partsOfBody.second;

import robotfolder.partsOfBody.interfaces.Head;
import org.springframework.stereotype.Component;

/**
 * Created by Michael Rudyy on 22-Jun-17.
 */

@Component
public class SecondHead implements Head {
    public SecondHead() {
    }

    public void action() {
        System.out.println("Second head action");
    }
}
