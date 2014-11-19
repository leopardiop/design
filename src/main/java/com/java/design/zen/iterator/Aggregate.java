package com.java.design.zen.iterator;

interface Aggregate {
    public void add(Object obj);

	public void remove(Object obj);

	public Iterator iterator();
}

interface Iterator {
    public Object next();

    public boolean hasNext();
}