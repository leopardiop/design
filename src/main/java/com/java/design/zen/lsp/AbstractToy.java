package com.java.design.zen.lsp;

/**
 * Created by peng.luwei on 2014/11/6.
 */
public abstract class AbstractToy implements Gun{


    @Override
    public void shoot() {
        System.out.println("toy not kill ..........");
    }
}
