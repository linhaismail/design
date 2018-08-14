package com.linhai.demo.design.adapter.common;

import com.linhai.demo.design.adapter.Player;

/**
 * @description: 中卫
 * @author: LinHai
 * @create: 2018-08-14 18:06
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中卫，" + name + "，进攻！");
    }

    @Override
    public void defense() {
        System.out.println("中卫，" + name + "，防守！");
    }
}
