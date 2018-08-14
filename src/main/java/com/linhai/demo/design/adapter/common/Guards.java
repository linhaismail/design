package com.linhai.demo.design.adapter.common;

import com.linhai.demo.design.adapter.Player;

/**
 * @description: 后卫
 * @author: LinHai
 * @create: 2018-08-14 18:07
 */
public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫，" + name + "，进攻！");
    }

    @Override
    public void defense() {
        System.out.println("后卫，" + name + "，防守！");
    }
}
