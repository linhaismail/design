package com.linhai.demo.design.adapter;

/**
 * @description: 抽象球员类
 * @author: LinHai
 * @create: 2018-08-14 17:58
 */
public abstract class Player {

    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
