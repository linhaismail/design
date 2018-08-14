package com.linhai.demo.design.adapter.adapter;

import com.linhai.demo.design.adapter.Player;
import com.linhai.demo.design.adapter.adaptee.ForeignPlayer;

/**
 * @description: 适配器：翻译者类
 * @author: LinHai
 * @create: 2018-08-14 18:21
 */
public class Translate extends Player {

    public Translate(String name) {
        super(name);
    }

    @Override
    public void attack() {
        new ForeignPlayer(name).进攻();
    }

    @Override
    public void defense() {
        new ForeignPlayer(name).防守();
    }
}
