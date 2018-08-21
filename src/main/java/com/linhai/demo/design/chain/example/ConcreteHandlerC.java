package com.linhai.demo.design.chain.example;

/**
 * @description: 具体处理类
 * @author: LinHai
 * @create: 2018-08-21 14:14
 */
public class ConcreteHandlerC extends Handler {
    @Override
    public void handlerRequest(Integer request) {
        if (request >= 20 && request < 30) {
            System.out.println("处理请求：" + this.getClass().getSimpleName());
        } else {
            if (request != null) {
                successor.handlerRequest(request);
            }
        }
    }
}
