package com.java.design.zen.isp;

/**
 * Created by peng.luwei on 2014/11/6.
 */
public class Girl implements IPettyGirl{
    @Override
    public void goodLooking() {
        System.out.println("goodLooking");
    }

    @Override
    public void niceFigure() {
        System.out.println("niceFigure");
    }

    @Override
    public void greatTemperament() {
        System.out.println("greatTemperament");
    }
}
