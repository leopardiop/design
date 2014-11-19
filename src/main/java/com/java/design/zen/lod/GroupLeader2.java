package com.java.design.zen.lod;

import java.util.List;

/**
 * Created by peng.luwei on 2014/11/6.
 */
public class GroupLeader2 {

    private List<Girl> grils;

    public GroupLeader2(List<Girl> grils) {
        this.grils = grils;
    }

    public void grilCounts(){

        System.out.println("count : "+this.grils.size());

    }

}
