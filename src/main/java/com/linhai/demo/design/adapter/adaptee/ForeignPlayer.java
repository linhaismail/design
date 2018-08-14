package com.linhai.demo.design.adapter.adaptee;

/**
 * @description: 外籍球员
 * @author: LinHai
 * @create: 2018-08-14 18:14
 */
public class ForeignPlayer {

    public String name;

    public ForeignPlayer(String name) {
        this.name = name;
    }

    public void 进攻() {
        System.out.println("外籍前锋，" + name + "，进攻");
    }

    public void 防守() {
        System.out.println("外籍前锋：" + name + "，防守");
    }
}
