package com.java.design.isp;

/**
 * Created by peng.luwei on 2014/11/6.
 */

import com.java.design.zen.isp.Girl;
import com.java.design.zen.isp.IPettyGirl;
import com.java.design.zen.isp.Searcher;

/**
 *
 * 接口隔离原则
 *
 *
 * 客户端不应该依赖它不需要的接口
 * 客户端依赖关系应该建立在最小的接口上
 *
 */
public class IspTest {

    public static void main(String[] args) {

        IPettyGirl iPettyGirl = new Girl();
        Searcher searcher = new Searcher(iPettyGirl);

        searcher.show();
    }
}
