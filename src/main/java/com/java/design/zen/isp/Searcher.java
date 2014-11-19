package com.java.design.zen.isp;

/**
 * Created by peng.luwei on 2014/11/6.
 */
public class Searcher extends AbstractSearcher{

    public Searcher(IPettyGirl iPettyGirl) {
        super(iPettyGirl);
    }

    @Override
    public void show() {
        super.iPettyGirl.goodLooking();
        super.iPettyGirl.niceFigure();
        super.iPettyGirl.greatTemperament();

    }
}
