package com.linhai.demo.design.observer.sub;

import com.linhai.demo.design.observer.base.Observer;
import com.linhai.demo.design.observer.base.Subject;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description: 实现Subject：通知者一
 * @author: LinHai
 * @create: 2018-08-13 10:20
 */
public class SecretarySubject implements Subject {

    private List<Observer> observerList = new CopyOnWriteArrayList<>();
    public String action = "boss is coming! ";

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }

    @Override
    public String subjectState() {
        return action;
    }
}
