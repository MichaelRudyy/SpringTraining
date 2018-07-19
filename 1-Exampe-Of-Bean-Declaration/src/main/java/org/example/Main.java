package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnimalConfiguration.class);
        Wolf wolf = (Wolf) context.getBean("wolf");
        Elephant elephant = (Elephant) context.getBean("elephant");

        System.out.println(wolf);
        System.out.println(elephant);
    }
}
