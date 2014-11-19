package com.java.design.zen.isp;

/**
 * Created by peng.luwei on 2014/11/6.
 */
public abstract class AbstractSearcher {

    IPettyGirl iPettyGirl;

    protected AbstractSearcher(IPettyGirl iPettyGirl) {
        this.iPettyGirl = iPettyGirl;
    }

    public abstract void show();
}
