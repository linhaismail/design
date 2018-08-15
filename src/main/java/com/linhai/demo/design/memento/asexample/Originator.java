package com.linhai.demo.design.memento.asexample;

import lombok.Data;

/**
 * @description: 发起人：负责创建一个备忘录Memento，用以记录当前时刻他的内部状态，并可使用备忘记录恢复内部状态。
 *               Originator可以根据需要决定Memento存储Originator的哪些内部状态
 * @author: LinHai
 * @create: 2018-08-15 10:28
 */
@Data
public class Originator {

    // 需要保存的属性，可能有多个
    private String state;

    // 创建一个备忘录，将当前需要保存的信息导入，并实例化要给Memento对象
    public Memento createMemento() {
        return new Memento(state);
    }

    // 恢复备忘录，将Memento导入，并恢复相关数据
    public void setMemento(Memento memento) {
        this.state = memento.state;
    }

    public void show() {
        System.out.println("当前状态：" + state);
    }
}
