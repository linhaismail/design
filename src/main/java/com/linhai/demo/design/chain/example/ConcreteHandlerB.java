package com.linhai.demo.design.chain.example;

/**
 * @description: 具体处理类
 * @author: LinHai
 * @create: 2018-08-21 14:12
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public void handlerRequest(Integer request) {
        if (request >= 10 && request <= 20) {
            System.out.println("处理请求：" + this.getClass().getSimpleName());
        } else {
            if (request != null) {
                successor.handlerRequest(request);
            }
        }
    }
}
