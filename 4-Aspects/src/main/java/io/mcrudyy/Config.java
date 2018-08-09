package io.mcrudyy;

import io.mcrudyy.impl.Performer;
import io.mcrudyy.impl.PerformerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {
    @Bean(value = "performer")
    public Performer getPerformer(){
        return new PerformerImpl();
    }

}
