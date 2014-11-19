package com.java.design.zen.lsp.sample;

/**
 * Created by peng.luwei on 2014/11/6.
 */
public interface Car {


    /**
     * 汽车的外观
     */
    public void facade();

    /**
     * 汽车的行为
     */
    public void behavior();

    public String color();

    public void purpose();

}
