package com.year3.sed.lecture13;

public class Keyboard implements ComputerPart{
    private String name;

    Keyboard(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Display " + name);
    }
}
