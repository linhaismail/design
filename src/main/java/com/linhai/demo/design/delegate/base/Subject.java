package com.linhai.demo.design.delegate.base;

public interface Subject {
    void notifyObserver(UpdateDelegate updateDelegate);
    String subjectState();
}
