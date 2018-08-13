package com.linhai.demo.design.delegate.ob;

import com.linhai.demo.design.delegate.base.Subject;

/**
 * @description: 继承Observer：观察者一
 * @author: LinHai
 * @create: 2018-08-13 09:35
 */
public class StockObserver {

    private String name;

    private Subject sub;

    public StockObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void updateStock() {
        System.out.println(sub.subjectState() + name + ", close stock, keep working!");
    }
}
