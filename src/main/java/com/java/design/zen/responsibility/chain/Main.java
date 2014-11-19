package com.java.design.zen.responsibility.chain;

/**
 * Created by peng.luwei on 2014/11/17.
 */

/**
 * 责任链模式
 *
 * Avoid coupling the sender of a request to its receiver by giving more than one object a change
 * to handle the request.Chain the receiving objects and pass the request along the chain until an
 * object handles it.
 * (使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将对象连成一条链，并沿着
 * 这条链传递该请求，直到有对象处理它为止。)
 *
 * 优点：
 * 将请求和处理分开。请求者可以不用知道是谁处理的，处理者可以不用知道请求的全貌，两者解耦，提高灵活性
 * (例如J2EE项目开发中，可以剥离出无状态Bean由责任链处理)
 *
 * (有状态会话bean ：每个用户有自己特有的一个实例，在用户的生存期内，bean保持了用户的信息，即“有状态”；
 * 一旦用户灭亡（调用结束或实例结束），bean的生命期也告结束。即每个用户最初都会得到一个初始的bean。
 *
 * 无状态会话bean ：bean一旦实例化就被加进会话池中，各个用户都可以共用。即使用户已经消亡，
 * bean 的生命期也不一定结束，它可能依然存在于会话池中，供其他用户调用。由于没有特定的用户，
 * 那么也就不能保持某一用户的状态，所以叫无状态bean。但无状态会话bean 并非没有状态，
 * 如果它有自己的属性（变量），那么这些变量就会受到所有调用它的用户的影响，这是在实际应用中必须注意的。)
 *
 * 缺点：
 * 一是性能问题，每个请求都从链头到尾，在链较长时，性能是大问题
 * 二是调试不方便，当链较长，环节较多，由于采用了类似递归方式，调试时逻辑比较复杂。
 *
 */
public class Main {

    public static void main(String[] args) {

        MyFilter m1 = new MyFilterImpl();
        MyFilter m2 = new MyFilterImpl2();
        MyFilter m3 = new MyFilterImpl3();

        Chain chain = new ConcreteChain();

        FilterList.addFilter(m1);
        FilterList.addFilter(m2);
        FilterList.addFilter(m3);

        chain.doFilter();

        chain.doFilter();
    }

}
