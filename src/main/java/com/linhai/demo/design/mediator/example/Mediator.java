package com.linhai.demo.design.mediator.example;

/**
 * @description: 抽象中介者
 * @author: LinHai
 * @create: 2018-08-21 17:22
 */
public abstract class Mediator {

    /**
     * @description:    抽象的发送消息方法，得到同事类和发送消息
     * @author:         LinHai
     * @create:         2018-08-21 17:23:45
     */
    public abstract void send(String message, Colleague colleague);
}
