package com.linhai.demo.design.chain.example;

/**
 * @description: 处理请求的接口
 * @author: LinHai
 * @create: 2018-08-21 13:55
 */
abstract class Handler {

    protected Handler successor;

    // 设置继任者
    public void setHandler(Handler successor) {
        this.successor = successor;
    }

    // 处理请求的方法
    public abstract void handlerRequest(Integer request);
}
