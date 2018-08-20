package com.linhai.demo.design.command.asexample;

import lombok.AllArgsConstructor;

/**
 * @description: 用来声明执行操作的接口
 * @author: LinHai
 * @create: 2018-08-16 15:23
 */
@AllArgsConstructor
public abstract class Command {

    protected Receiver receiver;

    public abstract void execute();
}
