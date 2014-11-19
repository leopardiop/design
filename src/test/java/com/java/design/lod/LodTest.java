package com.java.design.lod;

/**
 * Created by peng.luwei on 2014/11/6.
 */

import com.java.design.zen.lod.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则 （最少知识原则）
 *
 * 一个对象对其他对象应该最少了解。
 */
public class LodTest {

    public static void main(String[] args) {

        /*Teacher teacher = new Teacher();

        teacher.command(new GroupLeader());*/

        Teacher2 teacher2 = new Teacher2();

        List<Girl> girls = new ArrayList<Girl>();

        for (int i = 0; i < 20; i++) {
            girls.add(new Girl());
        }

        teacher2.command(new GroupLeader2(girls));

    }
}
