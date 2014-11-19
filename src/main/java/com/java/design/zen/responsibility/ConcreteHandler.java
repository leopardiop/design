package com.java.design.zen.responsibility;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class ConcreteHandler extends AbstractHandler{

    @Override
    public void handleRequest() {

        if(getSuccessor()!=null){

            System.out.println("the request is passed to " + getSuccessor());

            getSuccessor().handleRequest();

        }else{
            System.out.println("The request is handler here");
        }
    }
}

class Client {

    static private Handler handler1,handler2;

    public static void main(String []args){

        handler1 = new ConcreteHandler();

        handler2 = new ConcreteHandler();

        handler1.setSuccessor(handler2);

        handler1.handleRequest();

    }

}