package robotfolder;

import org.springframework.context.annotation.ComponentScan;
import robotfolder.partsOfBody.interfaces.Hand;
import robotfolder.partsOfBody.interfaces.Head;
import robotfolder.partsOfBody.interfaces.Leg;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;

/**
 * Created by Michael Rudyy on 23-Jun-17.
 */

@Lazy
@Configuration
public class RobotConfiguration implements BeanPostProcessor,InitializingBean,DisposableBean {

    @Bean
    @Autowired
    Robot robotFSF(@Qualifier("firstHead") Head head,
                @Qualifier("secondHand") Hand hand,
                @Qualifier("firstLeg") Leg leg) {
        return new Robot(head, hand, leg);
    }

    @PostConstruct
    void init() {
        System.out.println(" robotConfiguration created");
    }


    // Они используються при создании бинов
    // а именно перед созданием и после можно что-то с ним сделать
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("Before = " + s);
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("After = " + s);
        return o;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("INIT");
    }

    public void destroy() throws Exception {
        System.out.println(" DELETE");
    }
}
