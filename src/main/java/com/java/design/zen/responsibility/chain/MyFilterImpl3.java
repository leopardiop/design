package com.java.design.zen.responsibility.chain;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class MyFilterImpl3 implements MyFilter{
    @Override
    public void handler(Chain chain) {
        System.out.println("filter 3");
        chain.doFilter();
    }
}
