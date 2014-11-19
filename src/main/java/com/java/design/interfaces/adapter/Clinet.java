package com.java.design.interfaces.adapter;

/**
 * Created by peng.luwei on 2014/11/5.
 */
public class Clinet implements RequiredInterface{

    RequiredInterface rf = new AdapterExistingClass();

    @Override
    public void requiredMethod() {
        rf.requiredMethod();
    }
}
