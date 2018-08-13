package com.linhai.demo.design.observer.ob;

import com.linhai.demo.design.observer.base.Observer;
import com.linhai.demo.design.observer.base.Subject;

/**
 * @description: 继承Observer：观察者一
 * @author: LinHai
 * @create: 2018-08-13 09:35
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject sec) {
        super(name, sec);
    }

    @Override
    public void update() {
        System.out.println(sub.subjectState() + name + ", close stock, keep working!");
    }
}
