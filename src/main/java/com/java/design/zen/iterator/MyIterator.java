package com.java.design.zen.iterator;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public interface MyIterator {


    boolean hasNext();

    <T> T next();

}
