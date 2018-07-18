package robotfolder.partsOfBody;

import robotfolder.partsOfBody.first.FirstHand;
import robotfolder.partsOfBody.first.FirstHead;
import robotfolder.partsOfBody.first.FirstLeg;
import robotfolder.partsOfBody.second.SecondHand;
import robotfolder.partsOfBody.second.SecondHead;
import robotfolder.partsOfBody.second.SecondLeg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * Created by Michael Rudyy on 26-Jun-17.
 */

@Lazy
@Configuration
public class PartsConfiguration {

    @Bean
    public FirstHand firstHand() {
        return new FirstHand();
    }

    @Bean
    public FirstHead firstHead() {
        return new FirstHead();
    }

    @Bean
    public FirstLeg firstLeg() {
        return new FirstLeg();
    }

    @Bean
    public SecondHand secondHand() {
        return new SecondHand();
    }

    @Bean
    public SecondHead secondHead() {
        return new SecondHead();
    }

    @Bean
    public SecondLeg secondLeg() {
        return new SecondLeg();
    }
}
