package com.java.design.zen.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class Observable {

    private boolean change = false;

    private List<Observer> observers = new ArrayList<Observer>();

    public void notifyObserver(Object arg){
        for (Observer observer : observers) {
            observer.update(this,arg);
        }
    }

    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public boolean hasChange() {
        return change;
    }

    public synchronized void setChange() {
        this.change = true;
    }
}
