package com.java.design.zen.responsibility.chain;

import java.util.Stack;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class ConcreteChain implements Chain{
    int count = 0;
    @Override
    public void doFilter() {
        if(FilterList.getFilters().size() > count){
            MyFilter filter = FilterList.getFilters().get(count++);
            filter.handler(this);
        }else{
            count = 0;
            System.out.println("continue");
        }
    }
}

class FilterList {
    private static Stack<MyFilter> filters = new Stack<MyFilter>();

    public static void addFilter(MyFilter filter){
        filters.add(filter);
    }

    public static Stack<MyFilter> getFilters() {
        return filters;
    }

}
