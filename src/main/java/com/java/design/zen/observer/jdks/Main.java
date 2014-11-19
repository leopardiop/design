package com.java.design.zen.observer.jdks;

import com.java.design.zen.lsp.sample.*;

import java.util.Observer;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class Main {

    public static void main(String[] args) {

        Observer o = new Subject();
        Observer o1 = new Subject1();

        Client client = new Client("client1");
        Client client2 = new Client("client2");

        client.addObserver(o);
        client2.addObserver(o);
        client2.addObserver(o1);

        client.invoke();
        client2.invoke();
    }

}
