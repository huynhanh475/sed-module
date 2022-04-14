package com.year3.sed.lecture12.state;

import com.year3.sed.lecture12.Key;
import com.year3.sed.lecture12.KeyboardContext;

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
            case FN:
                break;
            case F11:
                break;
            case F12:
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
            case FN:
                context.setState(new FnState(context));
                break;
            case F11:
                break;
            case F12:
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
