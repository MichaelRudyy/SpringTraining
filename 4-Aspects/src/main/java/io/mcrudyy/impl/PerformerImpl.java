package io.mcrudyy.impl;

public class PerformerImpl implements Performer {

    @Override
    public void doSmth() {
        System.out.println("doSmth");
    }

    @Override
    public String print() {
        System.out.println("Printing");
        return null;
    }
}