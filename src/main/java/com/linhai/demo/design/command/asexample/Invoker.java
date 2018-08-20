package com.linhai.demo.design.command.asexample;

/**
 * @description: 要求该命令执行这个请求
 * @author: LinHai
 * @create: 2018-08-16 15:37
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void notifyCommand() {
        command.execute();
    }
}
