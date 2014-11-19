package com.java.design.interfaces;

/**
 * Created by peng.luwei on 2014/11/5.
 */
public class OozinozRocket extends PhysicalRocket implements RocketSim{

    private double time;

    protected OozinozRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        super(burnArea, burnRate, fuelMass, totalMass);
    }

    public double getMass(){
        return super.getMass();
    }

    public double getThrust(){
        return super.getThrust();
    }

    @Override
    public void setSimTime(double t) {
        this.time = t;
    }
}
