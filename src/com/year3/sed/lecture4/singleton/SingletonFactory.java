package com.year3.sed.lecture4.singleton;

public class SingletonFactory {

    private static volatile Singleton singleton = null;
    public static Singleton getInstance() {
        if (singleton == null) {
            System.out.println("No singleton created yet.");
            synchronized (SingletonFactory.class) {
                if (singleton == null) {
                    System.out.println("Create new Singleton.");
                    singleton = new Singleton();
                }
            }
        } else {
            System.out.println("There exist a Singleton.");
        }
        return singleton;
    }
}
