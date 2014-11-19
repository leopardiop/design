package com.java.design.zen.flyweight;

public abstract class Order {
    // 执行卖出动作
    public abstract void sell();
}

class FlavorOrder extends Order {
    public String flavor;

    // 获取咖啡口味
    public FlavorOrder(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void sell() {
        // TODO Auto-generated method stub
        System.out.println("卖出一份" + flavor + "的咖啡。");
    }
}