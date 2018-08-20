package com.linhai.demo.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 服务员类
 * @author: LinHai
 * @create: 2018-08-16 10:51
 */
public class Waiter {

    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    List<Command> commondList = new ArrayList<>();

    public void setCommand(Command command) {
        commondList.add(command);
        System.out.println("增加订单：" + command.toString());
    }

    public void cancelCommand(Command command) {
        commondList.remove(command);
        System.out.println("取消订单：" + command.toString());
    }
    
    public void notifyCommandAll() {
        for (Command command : commondList) {
            command.execute();
        }
    }
}
