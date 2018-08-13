package com.linhai.demo.design.observer.sub;

import com.linhai.demo.design.observer.base.Observer;
import com.linhai.demo.design.observer.base.Subject;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description: 实现Subject：通知者二
 * @author: LinHai
 * @create: 2018-08-13 14:10
 */
public class BossSubject implements Subject{

    private List<Observer> observerList = new CopyOnWriteArrayList<>();

    private String action = "I'm coming! ";

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
