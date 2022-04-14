package com.year3.sed.lecture11;

import com.year3.sed.lecture11.state.KeyboardState;
import com.year3.sed.lecture11.state.NormalState;

public class KeyboardContext {
    private KeyboardState state;

    public KeyboardContext(){
        state = new NormalState(this);
    }

    public void setState(KeyboardState state) {
        this.state = state;
    }

    public KeyboardState getState() {
        return state;
    }

    public void tap(Key key) {
        state.tap(key);
    }

    public void hold(Key key) {
        state.hold(key);
    }

    public void unhold(Key key) {
        state.unhold(key);
    }
}
