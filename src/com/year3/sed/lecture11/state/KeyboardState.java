package com.year3.sed.lecture11.state;

import com.year3.sed.lecture11.Key;

public interface KeyboardState {

    public void tap(Key key);
    public void hold(Key key);
    public void unhold(Key key);
}
