package database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(User.class)
public class Magic {
    private boolean exist = false;

    public Magic(){
        System.out.println("Lets magic " + exist);
    }

    private Magic(boolean isExist){
        this.exist = isExist;
    }

    @Bean(name = "trueMagic")
    public Magic getTrueMagic(){
        return new Magic(exist);
    }


}
