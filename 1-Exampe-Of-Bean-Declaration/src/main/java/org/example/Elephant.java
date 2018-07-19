package org.example;

import org.springframework.stereotype.Component;

@Component
public class Elephant {
    String name;
    int age;

    public Elephant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Elephant(){
        this.name = "Tom";
        this.age = 26;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
