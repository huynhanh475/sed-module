package com.year3.sed.lecture3;

public class Coke implements Item{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 0.9;
    }
}
