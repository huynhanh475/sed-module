package com.year3.sed.lecture11.state;

import com.year3.sed.lecture11.Key;
import com.year3.sed.lecture11.KeyboardContext;

public class CapsLockState implements KeyboardState{

    private KeyboardContext context;

    CapsLockState(KeyboardContext context){
        this.context = context;
    }


    @Override
    public void tap(Key key) {
        switch (key) {
            case Q:
                System.out.println("Q");
                break;
            case CAPS_LOCK:
                context.setState(new NormalState(context));
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
                System.out.println("Print a long string of 'Q'");
                break;
            case CAPS_LOCK:
                break;
            case SHIFT:
                context.setState(new ShiftCapsState(context));
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
