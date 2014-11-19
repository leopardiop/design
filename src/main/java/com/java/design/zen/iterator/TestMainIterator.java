package com.java.design.zen.iterator;

public class TestMainIterator {
    public static void main(String[] args) {
		Aggregate ag = new ConcreteAggregate();
		ag.add("david");
		ag.add("lisa");
		ag.add("shun");
		Iterator it = ag.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}