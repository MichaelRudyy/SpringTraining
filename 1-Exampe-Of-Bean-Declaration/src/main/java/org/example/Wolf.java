package org.example;

public class Wolf {
    String name;
    int numberOfChildrens;

    public Wolf(String name, int numberOfChildrens) {
        this.name = name;
        this.numberOfChildrens = numberOfChildrens;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "name='" + name + '\'' +
                ", numberOfChildrens=" + numberOfChildrens +
                '}';
    }
}
