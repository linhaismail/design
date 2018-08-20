package com.linhai.demo.design.command;

/**
 * @description: 烤肉命令
 * @author: LinHai
 * @create: 2018-08-16 11:05
 */
public class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void execute() {
        barbecuer.bakeMutton();
    }
}
