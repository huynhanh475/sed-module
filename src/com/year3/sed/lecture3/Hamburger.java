package com.year3.sed.lecture3;

public class Hamburger implements Item{
    @Override
    public String name() {
        return "Hamburger";
    }

    @Override
    public double price() {
        return 2.0;
    }
}
