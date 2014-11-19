package com.java.design.interfaces;

/**
 * Created by peng.luwei on 2014/11/5.
 */
public abstract class PhysicalRocket {

    protected PhysicalRocket(double burnArea,double burnRate,double fuelMass,double totalMass) {
    }

    double getBurnTime(){
        return 0;
    }

    public double getMass(){
        return 0;
    }

    public double getThrust(){
        return 0;
    }
}
