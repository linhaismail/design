package com.linhai.demo.design.command;

/**
 * @description: 命令模式
 * @author: LinHai
 * @create: 2018-08-16 14:41
 */
public class MainTest {

    public static void main(String[] args) {

        // 准备
        Barbecuer boy = new Barbecuer("boy");
        Command mutton = new BakeMuttonCommand(boy);
        Command chicken = new BakeChickenWingCommand(boy);
        Waiter waiter = new Waiter("waiterA");

        // 营业
        waiter.setCommand(mutton);
        waiter.setCommand(chicken);

        waiter.notifyCommandAll();
    }
}
