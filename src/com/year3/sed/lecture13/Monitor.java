package com.year3.sed.lecture13;

public class Monitor implements ComputerPart{
    private String name;

    Monitor(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Display " + name);
    }
}
