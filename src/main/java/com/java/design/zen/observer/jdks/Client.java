package com.java.design.zen.observer.jdks;


import java.util.Observable;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class Client extends Observable {

    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void invoke(){

        this.setChanged();

//        System.out.println(this.hasChanged()+","+this);

        this.notifyObservers(name);
    }
}
