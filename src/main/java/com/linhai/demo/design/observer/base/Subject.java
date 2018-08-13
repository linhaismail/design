package com.linhai.demo.design.observer.base;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObserver();
    String subjectState();
}
