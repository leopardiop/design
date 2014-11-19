package com.java.design.zen.lsp;

/**
 * Created by peng.luwei on 2014/11/5.
 */
public class Soldier {

    private Gun gun;

    public Soldier(Gun gun) {
        this.gun = gun;
    }

    public void killEnemy(){
        gun.shoot();
        System.out.println("-------------------------------");
    }
}
