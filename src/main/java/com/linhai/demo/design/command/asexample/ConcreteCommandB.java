package com.linhai.demo.design.command.asexample;

/**
 * @description: 将一个接收者对象绑定一个操作，调用接收者相应的操作，以实现Execute
 * @author: LinHai
 * @create: 2018-08-16 15:35
 */
public class ConcreteCommandB extends Command {

    public ConcreteCommandB(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action2();
    }
}
