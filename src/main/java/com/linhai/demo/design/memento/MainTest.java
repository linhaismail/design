package com.linhai.demo.design.memento;

/**
 * @description: 备忘录模式：在不破坏封装性的前提下，捕获一个对象的内容状态，并在该对象之外保存这个状态，
 *               这样以后就可以将该对象恢复到保存之前的状态。
 * @author: LinHai
 * @create: 2018-08-15 10:13
 */
public class MainTest {

    public static void main(String[] args) {

        GameRole gameRole = new GameRole(20,30,50);
        gameRole.show();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.roleStateMemento = gameRole.createMemento();

        gameRole.setVit(80);
        gameRole.setAtk(200);
        gameRole.setDef(444);
        gameRole.show();

        gameRole.setMemento(roleStateCaretaker.roleStateMemento);
        gameRole.show();
    }
}
