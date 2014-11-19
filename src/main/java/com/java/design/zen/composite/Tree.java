package com.java.design.zen.composite;

import java.util.Enumeration;
import java.util.Set;

/**
 * Created by peng.luwei on 2014/11/15.
 */
public interface Tree<T> {

    boolean isRoot();

    boolean isLeaf();

    boolean hasChildren();

    T getParent();

    void setParent(T parent);

    Enumeration<T> getChildrens();

    void addChildren(T children);

    void removeChildren(T children);
}
