package com.linhai.demo.design.mediator.example;

import lombok.Setter;

/**
 * @description: 具体中介
 * @author: LinHai
 * @create: 2018-08-21 18:32
 */
@Setter
public class ConcreteMediator extends Mediator {

    // 需要了解所有同事
    ConcreteColleagueA colleagueA;
    ConcreteColleagueB colleagueB;

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleagueA) {
            colleagueB.notifyMsg(message);
        } else if (colleague == colleagueB) {
            colleagueA.notifyMsg(message);
        } else {
            System.out.println("unKnown Type.");
        }
    }
}
