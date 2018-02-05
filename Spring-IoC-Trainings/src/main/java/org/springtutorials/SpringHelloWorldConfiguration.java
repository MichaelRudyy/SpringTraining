package org.springtutorials;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringHelloWorldConfiguration implements InitializingBean,DisposableBean {
    @Value("Hello")
    private String message;

    public String getMessage() {
        System.out.println(message);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Bean
    public SpringHelloWorldConfiguration springHelloWorldGet(){
        return new SpringHelloWorldConfiguration();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
