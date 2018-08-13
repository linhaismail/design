package com.linhai.demo.design.observer.base;

/**
 * @description:    women
 * @author:         LinHai
 * @create:         2018-08-07 15:42:46
 */
public abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
