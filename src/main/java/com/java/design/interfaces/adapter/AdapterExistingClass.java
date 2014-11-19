package com.java.design.interfaces.adapter;

/**
 * Created by peng.luwei on 2014/11/5.
 */
public class AdapterExistingClass extends ExistingClass implements RequiredInterface{

    @Override
    public void requiredMethod() {
        this.usefulMethod();
    }
}
