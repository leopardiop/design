package com.java.design.zen.lsp.sample;

/**
 * Created by peng.luwei on 2014/11/6.
 */
public abstract class AbstractCar implements Car{
    @Override
    public void facade() {
        System.out.println("汽车包含四个轮子和一个发动机");
    }

    @Override
    public void behavior() {
        System.out.println("向前行驶");
    }

    public abstract String color();

    @Override
    public void purpose(){
        System.out.println("载人交通工具");
    }
}
