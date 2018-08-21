package com.linhai.demo.design.chain;

/**
 * @description: 总监
 * @author: LinHai
 * @create: 2018-08-21 15:11
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplication(Request request) {
        if (request.getRequestType().equals("请假") && request.getRequestNum() <= 5) {
            System.out.println(name + ":" + request.getRequestContent() + " 批准");
        } else {
            if (superior != null) {
                superior.requestApplication(request);
            }
        }
    }
}
