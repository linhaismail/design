package com.linhai.demo.design.memento.asexample;

/**
 * @description: 备忘录：负责存储Originator对象的内部状态，并可防止Originator以外的其他对象访问备忘录。
 *               备忘录有两个接口，CareTaker只能看到备忘录的窄接口，它只能将备忘录传递给其他对象，
 *               Originator能够看到一个宽接口，允许它访问返回到先前状态所需的所有数据。
 * @author: LinHai
 * @create: 2018-08-15 10:34
 */
public class Memento {

    public String state;

    public Memento(String state) {
        this.state = state;
    }
}
