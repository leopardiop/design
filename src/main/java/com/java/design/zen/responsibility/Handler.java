package com.java.design.zen.responsibility;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public interface Handler {


    void handleRequest();

    public void setSuccessor(Handler successor);
}
