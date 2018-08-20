package com.linhai.demo.design.bridge.asexample;

/**
 * @description: 具体实现B
 * @author: LinHai
 * @create: 2018-08-16 10:14
 */
public class ConcreteImplementorB extends Implementor{
    @Override
    public void operation() {
        System.out.println("具体实现B的方法执行");
    }
}
