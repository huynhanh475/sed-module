package com.year3.sed.lecture4;

import com.year3.sed.lecture4.singleton.Singleton;
import com.year3.sed.lecture4.singleton.SingletonFactory;

public class Client {

    public static void main(String[] args) {
        Singleton singletonObject = SingletonFactory.getInstance();
        System.out.println(singletonObject);
        Singleton singletonObject2 = SingletonFactory.getInstance();
        System.out.println(singletonObject2);
        
    }
}
