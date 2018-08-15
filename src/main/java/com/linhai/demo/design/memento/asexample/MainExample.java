package com.linhai.demo.design.memento.asexample;

/**
 * @description: 范例
 * @author: LinHai
 * @create: 2018-08-15 11:08
 */
public class MainExample {

    public static void main(String[] args) {

        Originator originator = new Originator();
        originator.setState("On");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.memento = originator.createMemento();

        originator.setState("Off");
        originator.show();

        originator.setMemento(caretaker.memento);
        originator.show();
    }
}
