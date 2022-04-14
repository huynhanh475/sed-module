package com.year3.sed.lecture11.state;

import com.year3.sed.lecture11.Key;
import com.year3.sed.lecture11.KeyboardContext;

public class OnCapitalState implements KeyboardState{

    private KeyboardContext context;
    private boolean isCapsLockOn;
    private boolean isShiftHold;

    OnCapitalState(KeyboardContext context, boolean withCapsLock, boolean withShiftHold){
        this.context = context;
    }

    @Override
    public void tap(Key key) {
        switch (key) {
            case Q:
                System.out.println("Q");
                break;
            case CAPS_LOCK:
                isCapsLockOn = !isCapsLockOn;
                break;
            case SHIFT:
                break;
            default:
                System.out.println("Key undefined");
        }
        if (!isCapsLockOn && !isShiftHold) {
            context.setState(new NormalState(context));
        }
    }

    @Override
    public void hold(Key key) {
        switch (key) {
            case Q:
                System.out.println("Print a long string of letter 'Q'");
                break;
            case CAPS_LOCK:
                break;
            case SHIFT:
                isShiftHold = true;
                break;
            default:
                System.out.println("Key undefined");
        }
        if (!isCapsLockOn && !isShiftHold) {
            context.setState(new NormalState(context));
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
                isShiftHold = false;
                break;
            default:
                System.out.println("Key undefined");
        }
        if (!isCapsLockOn && !isShiftHold) {
            context.setState(new NormalState(context));
        }
    }
}
