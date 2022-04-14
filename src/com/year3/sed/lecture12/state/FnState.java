package com.year3.sed.lecture12.state;

import com.year3.sed.lecture12.Key;
import com.year3.sed.lecture12.KeyboardContext;

public class FnState implements KeyboardState{
    private KeyboardContext context;

    public FnState(KeyboardContext context){
        this.context = context;
    }

    @Override
    public void tap(Key key) {
        switch (key) {
            case Q:
                break;
            case CAPS_LOCK:
                context.setState(new CapsFnState(context));
                break;
            case SHIFT:
                break;
            case FN:
                break;
            case F11:
                System.out.println("-volume");
                break;
            case F12:
                System.out.println("+volume");
                break;
            default:
                System.out.println("Key undefined");
        }
    }

    @Override
    public void hold(Key key) {
        switch (key) {
            case Q:
                break;
            case CAPS_LOCK:
                break;
            case SHIFT:
                context.setState(new ShiftFnState(context));
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
    public void unhold(Key key) {
        switch (key) {
            case Q:
                break;
            case CAPS_LOCK:
                break;
            case SHIFT:
                break;
            case FN:
                context.setState(new NormalState(context));
                break;
            case F11:
                break;
            case F12:
                break;
            default:
                System.out.println("Key undefined");
        }
    }
}
