package com.linhai.demo.design.delegate.sub;

import com.linhai.demo.design.delegate.base.Subject;
import com.linhai.demo.design.delegate.base.UpdateDelegate;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description: 实现Subject：通知者一
 * @author: LinHai
 * @create: 2018-08-13 10:20
 */
public class SecretarySubject implements Subject {

    public String action = "boss is coming! ";


    @Override
    public void notifyObserver(UpdateDelegate updateDelegate) {

    }

    @Override
    public String subjectState() {
        return action;
    }
}
