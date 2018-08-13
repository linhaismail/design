package com.linhai.demo.design.observer.ob;

import com.linhai.demo.design.observer.base.Subject;
import com.linhai.demo.design.observer.base.Observer;

/**
 * @description: 继承Observer：观察者二
 * @author: LinHai
 * @create: 2018-08-13 09:59
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.subjectState() + name + " ,close match, keep working!");
    }
}
