package com.year3.sed.lecture11.state;

import com.year3.sed.lecture11.Key;
import com.year3.sed.lecture11.KeyboardContext;

public class NormalState implements KeyboardState {
    private KeyboardContext context;

    public NormalState(KeyboardContext context){
        this.context = context;
    }

    @Override
    public void tap(Key key) {
        switch (key) {
            case Q:
                System.out.println("q");
                break;
            case CAPS_LOCK:
                context.setState(new CapsLockState(context));
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
                System.out.println("Print a long string of letter 'q'");
                break;
            case CAPS_LOCK:
                break;
            case SHIFT:
                context.setState(new ShiftState(context));
                break;
            default:
                System.out.println("Key undefined");
        }
    }

    @Override
    public void unhold(Key key) {
        //Nothing is on hold to unhold
    }
}
