package com.java.design.zen.composite;

import java.util.*;

/**
 * Created by peng.luwei on 2014/11/15.
 */
public class TreeElement implements Tree<TreeElement>{

    private Long id;

    private String name;

    private TreeElement parnet;

    private Vector<TreeElement> childrens = new Vector<TreeElement>(25);

    public TreeElement(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isRoot() {
        return parnet.getParent() == null;
    }

    @Override
    public boolean isLeaf() {

        if(isRoot()){
            return false;
        }
        if(hasChildren()){
            return false;
        }
        return true;
    }

    @Override
    public boolean hasChildren() {
        return childrens.size() > 0;
    }

    @Override
    public TreeElement getParent() {
        return parnet;
    }

    @Override
    public void setParent(TreeElement parent) {
        this.parnet = parent;
    }

    public String white(){
        if(isRoot()){
            return "";
        }
        return "\t";
    }

    @Override
    public Enumeration<TreeElement> getChildrens() {

        /*for (Iterator<TreeElement> iterator = childrens.iterator(); iterator.hasNext(); ) {
            TreeElement next = iterator.next();
            System.out.println(parnet.white()+white()+" name : " + next.getName());
        }*/

        return childrens.elements();
    }

    @Override
    public void addChildren(TreeElement children) {
        childrens.add(children);
    }

    @Override
    public void removeChildren(TreeElement children) {
        childrens.remove(children);
    }

    @Override
    public String toString() {
        return "TreeElement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parnet=" + parnet +
                ", childrens=" + childrens.toString() +'}';
    }
}
