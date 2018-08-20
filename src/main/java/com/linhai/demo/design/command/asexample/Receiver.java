package com.linhai.demo.design.command.asexample;

/**
 * @description: 知道如何实施与执行一个请求相关的操作，任何类都可以作为一个接收者
 * @author: LinHai
 * @create: 2018-08-16 15:29
 */
public class Receiver {

    public void action1() {
        System.out.println("action 1 ...");
    }

    public void action2() {
        System.out.println("action 2 ...");
    }
}
