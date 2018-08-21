package com.linhai.demo.design.chain.example;

/**
 * @description: 具体处理者类
 * @author: LinHai
 * @create: 2018-08-21 14:00
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handlerRequest(Integer request) {
        if (request >= 0 && request <= 10) {
            System.out.println("处理请求：" + this.getClass().getSimpleName());
        } else {
            if (request != null) {
                successor.handlerRequest(request);
            }
        }
    }
}
