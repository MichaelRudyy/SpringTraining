package config;

import interfaces.Knight;
import interfaces.Quest;
import mans.BraveKnight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import quests.DragonQuest;

@Configuration
public class KnightConfiguration {

    @Bean
    @Autowired
    public Knight knight(Quest quest){
        return new BraveKnight(quest);
    }

    @Bean
    public Quest quest(){
        return new DragonQuest();
    }
}
