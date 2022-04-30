package com.year3.sed.lecture13;

public class Client {
    public static void main(String[] args) {
        Keyboard keyboard1 = new Keyboard("Keyboard 1");
        Monitor monitor1 = new Monitor("Monitor 1");
        Mouse mouse1 = new Mouse("Mouse 1");

        Computer computer = new Computer("Computer 1");
        computer.addPart(keyboard1);
        computer.addPart(monitor1);
        computer.addPart(mouse1);

        Keyboard keyboard2 = new Keyboard("Keyboard 2");
        Mouse mouse2 = new Mouse("Mouse 2");

        Computer computer2 = new Computer("Computer 2");
        computer2.addPart(keyboard2);
        computer2.addPart(mouse2);

        computer.addPart(computer2);

        computer.display();
    }
}
