package com.linhai.demo.design.chain;

/**
 * @description: 总经理
 * @author: LinHai
 * @create: 2018-08-21 15:14
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假")) {
            System.out.println(name + ":" + request.getRequestContent() + " 批准");
        } else if (request.getRequestType().equals("加薪") && request.getRequestNum() <= 500) {
            System.out.println(name + ":" + request.getRequestContent() + " 批准");
        } else if (request.getRequestType().equals("加薪") && request.getRequestNum() > 500) {
            System.out.println(name + ":" + request.getRequestContent() + " 再考虑");
        }
    }
}
