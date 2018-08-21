package com.linhai.demo.design.mediator.example;

/**
 * @description: 具体同时类B
 * @author: LinHai
 * @create: 2018-08-21 18:30
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyMsg(String message) {
        System.out.println("Colleague B 收到消息：" + message);
    }
}
