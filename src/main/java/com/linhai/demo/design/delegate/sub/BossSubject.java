package com.linhai.demo.design.delegate.sub;

import com.linhai.demo.design.delegate.base.Subject;
import com.linhai.demo.design.delegate.base.UpdateDelegate;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description: 实现Subject：通知者二
 * @author: LinHai
 * @create: 2018-08-13 14:10
 */
public class BossSubject implements Subject {

    private String action = "I'm coming! ";

    @Override
    public void notifyObserver(UpdateDelegate updateDelegate) {
        updateDelegate.execute();
    }

    @Override
    public String subjectState() {
        return action;
    }
}
