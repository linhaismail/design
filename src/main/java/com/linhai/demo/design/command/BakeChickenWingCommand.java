package com.linhai.demo.design.command;

/**
 * @description: 烤鸡翅命令
 * @author: LinHai
 * @create: 2018-08-16 11:07
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void execute() {
        barbecuer.bakeChickenWing();
    }
}
