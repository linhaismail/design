package com.linhai.demo.design.chain;

/**
 * @description: 接口
 * @author: LinHai
 * @create: 2018-08-21 14:54
 */
abstract class Manager {

    protected String name;

    // 上级
    public Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    // 设置上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract public void requestApplication(Request request);
}
