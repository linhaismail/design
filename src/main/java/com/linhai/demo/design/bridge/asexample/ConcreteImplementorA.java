package com.linhai.demo.design.bridge.asexample;

/**
 * @description: 具体实现A
 * @author: LinHai
 * @create: 2018-08-16 10:13
 */
public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现A的方法执行");
    }
}
