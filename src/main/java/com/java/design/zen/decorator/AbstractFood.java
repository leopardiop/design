package com.java.design.zen.decorator;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public abstract class AbstractFood implements Food{

    private Food food;

    protected AbstractFood(Food food) {
        this.food = food;
    }

    @Override
    public abstract String material();
}
