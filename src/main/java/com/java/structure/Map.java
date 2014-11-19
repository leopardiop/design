package com.java.structure;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public interface Map<K,V> {

    void put(K k,V v);

    void remove(K k);

}

class Test{

    public static void main(String[] args) {

//        java.util.Map<String,String> map = new HashMap<String, String>();

//        System.out.println(map.hashCode());

        System.out.println(UUID.randomUUID().toString());

    }

}
