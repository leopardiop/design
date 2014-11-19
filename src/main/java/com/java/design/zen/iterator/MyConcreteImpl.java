package com.java.design.zen.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class MyConcreteImpl implements MyIterator{

    private List<String> list = new ArrayList<String>();

    private int cursor = 0;

    public MyConcreteImpl(List<String> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return list.size() > cursor;
    }

    @Override
    public <T> T next() {
        return (T) list.get(cursor++);
    }

    public static void main(String[] args) {
        
        MyAggregate<String> aggregate = new MyAggregateImpl();
        
        aggregate.add("abcde");
        aggregate.add("zzzz");

//        MyIterator it = aggregate.iterator();
//        while (it.hasNext()){
//            System.out.println("aggregate.iterator().next() = " + it.next());
//        }

        List<String> ls = new ArrayList<String>();

        ls.iterator();

        Map<String,String> map = null;

        map.entrySet();
    }
}

class MyAggregateImpl implements MyAggregate<String>{

    private List<String> list = new ArrayList<String>(); 

    @Override
    public void add(String s) {
        list.add(s);
    }

    @Override
    public void remove(String s) {
        list.remove(s);
    }

    @Override
    public MyIterator iterator() {
        return new MyConcreteImpl(list);
    }
}
