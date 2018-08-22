package com.linhai.demo.design.mediator.example;

/**
 * @description: 用一个中介对象来封装一系列的对象交互，
 *               中介者使各对象不用显式的相互引用，从而使其耦合松散，
 *               而且可以独立的改变他们之间的交互。
 * @author: LinHai
 * @create: 2018-08-21 17:17
 */
public class MainExample {

    public static void main(String[] args) {

        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);

        mediator.colleagueA = colleagueA;
        mediator.colleagueB = colleagueB;

        colleagueA.send("how are you ?");
        colleagueB.send("fine.");
    }
}
