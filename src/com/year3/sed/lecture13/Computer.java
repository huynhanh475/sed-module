package com.year3.sed.lecture13;

import java.util.ArrayList;
import java.util.List;

public class Computer implements ComputerPart {
    private List<ComputerPart> parts = new ArrayList<ComputerPart>();
    private String name;

    Computer(String name) {
        this.name = name;
    }


    public void addPart(ComputerPart part) {
        parts.add(part);
    }

    public void removePart(ComputerPart part) {
        parts.remove(part);
    }

    public void display() {
        System.out.println("Display " + name + ":");
        for (ComputerPart part : parts) {
            part.display();
        }
    }
}
