package com.linhai.demo.design.state.asexample;

/**
 * @description: 范例
 * @author: LinHai
 * @create: 2018-08-14 14:33
 */
public class MainExample {

    public static void main(String[] args) {

        Context c = new Context(new ConcreteStateA());

        c.request();
        c.getState();

        c.request();
        c.getState();

        c.request();
        c.getState();
    }
}
