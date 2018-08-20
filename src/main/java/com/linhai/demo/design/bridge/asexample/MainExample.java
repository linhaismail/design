package com.linhai.demo.design.bridge.asexample;

/**
 * @description:
 * @author: LinHai
 * @create: 2018-08-16 10:30
 */
public class MainExample {

    public static void main(String[] args) {

        Abstraction abstraction = new Abstraction();
        abstraction.setImplementor(new ConcreteImplementorA());
        abstraction.operation();
    }
}
