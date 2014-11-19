package com.java.design.zen.decorator;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class Fish extends AbstractFood{

    Food food;

    protected Fish(Food food) {
        super(food);
        this.food = food;
    }

    @Override
    public String material() {
        return food.material()+" + 鱼";
    }
}
