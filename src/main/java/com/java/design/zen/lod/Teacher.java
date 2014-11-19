package com.java.design.zen.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peng.luwei on 2014/11/6.
 */
public class Teacher {

    public void command(GroupLeader groupLeader){

        List<Girl> girls = new ArrayList<Girl>();

        for (int i = 0; i < 20; i++) {
            girls.add(new Girl());
        }

        groupLeader.countGroup(girls);

    }

}
