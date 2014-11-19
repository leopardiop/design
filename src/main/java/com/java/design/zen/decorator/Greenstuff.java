package com.java.design.zen.decorator;

/**
 * Created by peng.luwei on 2014/11/17.
 */
public class Greenstuff extends AbstractFood{

    Food food;

    protected Greenstuff(Food food) {
        super(food);
        this.food = food;
    }

    @Override
    public String material() {
        return food.material()+" + 蔬菜";
    }
}
