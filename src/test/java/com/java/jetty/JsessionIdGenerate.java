package com.java.jetty;

import java.util.Random;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class JsessionIdGenerate {

    public static void main(String[] args) {

        long created = System.currentTimeMillis();
        String id = null;
        long r= (JsessionIdGenerate.class.hashCode()^Runtime.getRuntime().freeMemory()^new Random().nextInt()
                ^(((long)JsessionIdGenerate.class.hashCode())<<32));

        System.out.println("r1 = " + r);
        r ^= created;
//        if (r<0)
//            r=-r;

        created ^=r;
//        r ^= System.identityHashCode(r);
        System.out.println("r2 = " + r);
        id=Long.toString(created,36);

        System.out.println("id = " + id);
    }

}
