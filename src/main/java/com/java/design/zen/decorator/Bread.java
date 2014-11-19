package com.java.design.zen.decorator;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class Bread implements Food{

    private String name;

    public Bread(String name) {
        this.name = name;
    }

    @Override
    public String material() {
        return name;
    }

}
