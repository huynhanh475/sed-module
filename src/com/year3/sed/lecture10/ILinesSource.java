package com.year3.sed.lecture10;

import java.util.ArrayList;

public abstract class ILinesSource {
    protected String state;
    protected ArrayList<ILinesProcessor> processors;

    public abstract String getState();

    public abstract void setState(String state);

    public abstract void notifyObservers();

    public abstract void attach(ILinesProcessor processor);
}
