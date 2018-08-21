package com.linhai.demo.design.mediator.example;

/**
 * @description: 具体同事类A
 * @author: LinHai
 * @create: 2018-08-21 18:11
 */
class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notifyMsg(String message) {
        System.out.println("Colleague A 收到消息：" + message);
    }
}
