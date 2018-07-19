package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AnimalConfiguration {
    @Bean
    Wolf wolf() {
        return new Wolf("Anton", 265);
    }
}
