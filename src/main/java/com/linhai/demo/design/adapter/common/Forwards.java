package com.linhai.demo.design.adapter.common;

import com.linhai.demo.design.adapter.Player;

/**
 * @description: 前锋
 * @author: LinHai
 * @create: 2018-08-14 18:02
 */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋，" + name + "，进攻！");
    }

    @Override
    public void defense() {
        System.out.println("前锋，" + name + "，防守！");
    }
}
