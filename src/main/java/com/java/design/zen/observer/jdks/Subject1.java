package com.java.design.zen.observer.jdks;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class Subject1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {

        System.out.println(o+"-------------123-----------------------"+o.hasChanged());
        System.out.println("arg = " + arg);
    }
}
