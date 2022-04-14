package com.year3.sed.lecture11.state;

import com.year3.sed.lecture11.Key;
import com.year3.sed.lecture11.KeyboardContext;

public class ShiftCapsState implements KeyboardState{
    private KeyboardContext context;
    ShiftCapsState(KeyboardContext context) {
        this.context = context;
    }

    @Override
    public void tap(Key key) {
        switch (key) {
            case Q:
                System.out.println("q");
                break;
            case CAPS_LOCK:
                context.setState(new ShiftState(context));
                break;
            case SHIFT:
                break;
            default:
                System.out.println("Key undefined");
        }
    }

    @Override
    public void hold(Key key) {
        switch (key) {
            case Q:
                System.out.println("Print a long string of 'q'");
                break;
            case CAPS_LOCK:
                break;
            case SHIFT:
                break;
            default:
                System.out.println("Key undefined");
        }
    }

    @Override
    public void unhold(Key key) {
        switch (key) {
            case Q:
                break;
            case CAPS_LOCK:
                break;
            case SHIFT:
                context.setState(new CapsLockState(context));
                break;
            default:
                System.out.println("Key undefined");
        }
    }
}
