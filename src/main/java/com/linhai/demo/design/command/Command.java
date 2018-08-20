package com.linhai.demo.design.command;

import lombok.AllArgsConstructor;

/**
 * @description: 抽象命令类
 * @author: LinHai
 * @create: 2018-08-16 11:01
 */
@AllArgsConstructor
public abstract class Command {

    public Barbecuer barbecuer;

    public abstract void execute();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
