package com.year3.sed.lecture12;

import static com.year3.sed.lecture12.Key.*;

public class Client {
    public static void main(String args[]) {
        KeyboardContext keyboard = new KeyboardContext();
        System.out.println("Keyboard");
        System.out.println("===============");

        System.out.println("==Hold Fn==");
        keyboard.hold(FN);

        System.out.println("==Tap F11 & F12==");
        keyboard.tap(F11);
        keyboard.tap(F12);

        System.out.println("==Hold Shift==");
        keyboard.hold(SHIFT);

        System.out.println("==Tap F11 & F12==");
        keyboard.tap(F11);
        keyboard.tap(F12);

        System.out.println("==Toggle Caps Lock on==");
        keyboard.tap(CAPS_LOCK);

        System.out.println("==Tap F11 & F12==");
        keyboard.tap(F11);
        keyboard.tap(F12);

        System.out.println("==Unhold Shift==");
        keyboard.unhold(SHIFT);

        System.out.println("==Tap F11 & F12==");
        keyboard.tap(F11);
        keyboard.tap(F12);

        System.out.println("==Unhold Fn==");
        keyboard.unhold(FN);

        System.out.println("==Tap Q==");
        keyboard.tap(Q);
    }

}
