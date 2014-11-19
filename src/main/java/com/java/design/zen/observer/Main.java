package com.java.design.zen.observer;

/**
 * Created by peng.luwei on 2014/11/17.
 */

/**
 * 观察者模式
 *
 * Define a one-to-many dependency between objects so that when one object changes state,all its
 * dependents are notified and updated automatically
 * (定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象者会得到通知并自动更新。)
 *
 *
 * Observable被观察者
 * 定义被观察者必须实现的职责，它必须能够动态地增加、取消观察者。管理并通知观察者。
 *
 * Observer观察者
 * 观察者接收到消息后，即进行update,对接收信息进行处理。
 *
 *
 * 优点：
 * 观察者和被观察者之间是抽象耦合
 * 建立一套触发机制
 *
 * 缺点：
 * 开发效率和运行效率问题，开发和调试比较复杂。
 * 一个观察者卡壳，会影响整体的执行效率。这种情况下，一般考虑异步方式。
 * 多级触发效率更让人担忧。
 *
 */
public class Main {

    public static void main(String[] args) {

        Observer o = new SubjectMain();
        ClientMain c1 = new ClientMain();

        c1.addObserver(o);

        c1.invoke();
    }

}
class SubjectMain implements Observer{

    @Override
    public void update(Observable o, Object arg) {

        System.out.println(o.hasChange()+","+arg);

    }
}

class ClientMain extends Observable{

    public void invoke(){
        this.setChange();
        this.notifyObserver("invoke");
    }

}