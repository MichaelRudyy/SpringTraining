package io.mcrudyy.aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
    @Before("execution(* io.mcrudyy.impl.PerformerImpl.doSmth())")
    public void doThings(){
        System.out.println("Aspect-Before");
    }
}
