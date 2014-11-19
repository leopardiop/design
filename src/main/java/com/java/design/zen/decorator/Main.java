package com.java.design.zen.decorator;

/**
 * Created by peng.luwei on 2014/11/17.
 */

/**
 * 装饰器模式
 *
 * Attach additional responsibilities to an object dynamically keeping the same interface.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 * （动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更为灵活。）
 *
 *优点：
 * 装饰类和被装饰类可以独立发展，而不会相互耦合。
 * 装饰模式是继承关系的一个替代方案。
 * 装饰模式可以动态地扩展一个实现类的功能
 *
 * 缺点：
 * 多层的装饰是比较复杂。
 * 尽量减少装饰类的数量，以便降低系统的复杂度。
 *
 */
public class Main {

    public static void main(String[] args) {

        Food food = new Greenstuff(new Fish(new Bread("食物 ： ")));

        System.out.println(food.material());
    }

}
