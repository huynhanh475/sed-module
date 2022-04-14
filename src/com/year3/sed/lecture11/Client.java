package com.year3.sed.lecture11;

public class Client {
    public static void main(String args[]) {
        System.out.println("Keyboard");
        System.out.println("===============");

        Keyboard keyboard = new Keyboard();
        keyboard.tap(Key.Q);
        keyboard.tap(Key.CAPS_LOCK);
        keyboard.tap(Key.Q);
    }

}
