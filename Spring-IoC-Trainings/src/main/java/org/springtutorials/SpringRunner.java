package org.springtutorials;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        SpringHelloWorldConfiguration helloWorld = (SpringHelloWorldConfiguration) context.getBean("springHelloWorldGet");

        helloWorld.getMessage();

        context.registerShutdownHook();
    }
}
