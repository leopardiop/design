package com.java.design.zen.iterator;

import java.util.*;

class ConcreteAggregate implements Aggregate {
    private List list = new ArrayList();

	public void add(Object obj) {
		list.add(obj);
	}

	public Iterator iterator() {
		return new ConcreteIterator(list);
	}

	public void remove(Object obj) {
		list.remove(obj);
	}
}

class ConcreteIterator implements Iterator {
    private List list = new ArrayList();
    private int cursor = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    public boolean hasNext() {
        if (cursor == list.size()) {
            return false;
        }
        return true;
    }

    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }

}