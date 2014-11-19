package com.java.design.lsp;

/**
 * Created by peng.luwei on 2014/11/5.
 */

import com.java.design.zen.lsp.Rifle;
import com.java.design.zen.lsp.Soldier;
import com.java.design.zen.lsp.sample.Benz;
import com.java.design.zen.lsp.sample.Client;
import com.java.design.zen.lsp.sample.ToyCar;

/**
 * 里氏倒置原则
 *
 * if for each object o1 of type S there is an object o2 of type T
 * such that for all programs P defined in terms of T,the behavior of P
 * is unchanged when o1 is substituted for o2 then s is a subtype of T.
 *
 * (如果对每一个类型为S的对象o1都有类型为T的对象o2，使得以T定义的所有程序P在所有的对象
 * o1都代换成o2时，程序P的行为没有发生变化，那么类型S是类型T的子类型。)
 *
 * 只要父类能出现的地方子类就可以出现，而且替换为子类也不会产生任何错误或异常，
 * 使用者可能根本主不需要知道是父类还是子类。
 */
public class LSPTest {


    public static void main(String[] args) {
        Client c = new Client();

        c.setCar(new Benz());

        c.drive();

        System.out.println();
        Client c1 = new Client();

        c.setCar(new ToyCar());

        c.drive();


//        Soldier soldier = new Soldier(new Rifle());

//        soldier.killEnemy();
    }

}
