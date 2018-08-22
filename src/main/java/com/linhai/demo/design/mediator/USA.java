package com.linhai.demo.design.mediator;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-22 10:55
 */
public class USA extends Country {

    public USA(UnionNation un) {
        super(un);
    }

    @Override
    public void notifyMsg(String message) {
        System.out.println("USA accept message:" + message);
    }
}
