package com.linhai.demo.design.delegate.ob;

import com.linhai.demo.design.delegate.base.Subject;

/**
 * @description: 继承Observer：观察者二
 * @author: LinHai
 * @create: 2018-08-13 09:59
 */
public class NBAObserver {

    private String name;

    private Subject sub;

    public NBAObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public void updateNBA() {
        System.out.println(sub.subjectState() + name + " ,close match, keep working!");
    }
}
