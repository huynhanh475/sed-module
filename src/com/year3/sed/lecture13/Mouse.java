package com.year3.sed.lecture13;

public class Mouse implements ComputerPart{
    private String name;

    Mouse(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Display " + name);
    }
}
