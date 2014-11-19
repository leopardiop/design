package com.java.design.zen.lsp.sample;

/**
 * Created by peng.luwei on 2014/11/6.
 */
public class Client {

    private Car car;

    public void drive(){
        car.behavior();
        car.purpose();
        car.facade();
        System.out.println("client drive "+car.color());
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
