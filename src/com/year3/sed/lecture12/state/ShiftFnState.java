package com.year3.sed.lecture12.state;

import com.year3.sed.lecture12.Key;
import com.year3.sed.lecture12.KeyboardContext;

public class ShiftFnState implements KeyboardState{
    private KeyboardContext context;

    public ShiftFnState(KeyboardContext context){
        this.context = context;
    }

    @Override
    public void tap(Key key) {
        switch (key) {
            case Q:
                break;
            case CAPS_LOCK:
                context.setState(new ShiftCapsFnState(context));
                break;
            case SHIFT:
                break;
            case FN:
                break;
            case F11:
                System.out.println("-luminosity");
                break;
            case F12:
                System.out.println("+luminosity");
                break;
            default:
                System.out.println("Key undefined");
        }
    }

    @Override
    public void hold(Key key) {
//        switch (key) {
//            case Q:
//                break;
//            case CAPS_LOCK:
//                break;
//            case SHIFT:
//                break;
//            case FN:
//                break;
//            case F11:
//                break;
//            case F12:
//                break;
//            default:
//                System.out.println("Key undefined");
//        }
        //Nothing to do. All key able to be held is already on hold
    }

    @Override
    public void unhold(Key key) {
        switch (key) {
            case Q:
                break;
            case CAPS_LOCK:
                break;
            case SHIFT:
                context.setState(new FnState(context));
                break;
            case FN:
                context.setState(new ShiftState(context));
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
