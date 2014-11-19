package com.java.design.zen.iterator;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public interface MyAggregate<T> {

    void add(T t);

    void remove(T t);

    MyIterator iterator();
}
