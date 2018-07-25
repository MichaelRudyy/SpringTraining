package database;

import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public class User implements Condition  {
    private String name;
    private int age;

    public User() {
        this.name = "public bob";
        this.age = 20;
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Bean(name = "bob", initMethod = "creatingUser", destroyMethod = "deletingUser")
    @Profile("bob")
    public User getUser() {
        return new User("Bob", 15);
    }

    private void creatingUser() {
        System.out.println("User creating.....");
    }

    private void deletingUser() {
        System.out.println("Deleting user.....");
    }

    @Bean(name = "bob")
    @Profile("tom")
    public User getUser1() {
        return new User("Tom", 65);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        System.out.println("MATCHES");
        return true;
    }
}
