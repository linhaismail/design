package com.linhai.demo.design.mediator;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-22 10:56
 */
public class Iraq extends Country {

    public Iraq(UnionNation un) {
        super(un);
    }

    @Override
    public void notifyMsg(String message) {
        System.out.println("Iraq accept message:" + message);
    }
}
