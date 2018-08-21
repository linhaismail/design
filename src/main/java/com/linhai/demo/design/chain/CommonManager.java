package com.linhai.demo.design.chain;

/**
 * @description: 经理
 * @author: LinHai
 * @create: 2018-08-21 14:58
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getRequestNum() <= 2) {
            System.out.println(name + ":" + request.getRequestContent() + " 批准");
        } else {
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
