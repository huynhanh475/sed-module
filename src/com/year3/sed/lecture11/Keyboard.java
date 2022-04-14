package com.year3.sed.lecture11;

public class Keyboard {
    private Toggle capsLock = Toggle.OFF;

    private Toggle toggle(Toggle p) {
        Toggle result;
        switch (p) {
            case ON: {
                result = Toggle.OFF;
                break;
            }
            case OFF: {
                result = Toggle.ON;
                break;
            }
            default : {
                result = p;
            }
        }
        return result;
    }

    public void tap(Key k) {
        switch(k) {
            case Q : {
                switch (capsLock) {
                    case ON : {
                        System.out.println("Q");
                        break;
                    }
                    case OFF : {
                        System.out.println("q");
                        break;
                    }
                    default : {
                        System.out.println("UNEXPECTED");
                    }
                }
                break;

            }
            case CAPS_LOCK : {
                capsLock = toggle(capsLock);
                break;
            }
            default : {
                System.out.println("UNKNOWN KEY");
            }
        }

    }

}
