package com.java.design.zen.responsibility;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public abstract class AbstractHandler implements Handler{

    private Handler successor;

    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
