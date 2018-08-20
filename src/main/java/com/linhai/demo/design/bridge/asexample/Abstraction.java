package com.linhai.demo.design.bridge.asexample;

/**
 * @description: 抽象类
 * @author: LinHai
 * @create: 2018-08-16 10:16
 */
public class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public void operation() {
        implementor.operation();
    }
}
