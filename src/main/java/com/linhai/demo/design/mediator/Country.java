package com.linhai.demo.design.mediator;

import lombok.AllArgsConstructor;

/**
 * @description: 国家类
 * @author: LinHai
 * @create: 2018-08-22 10:48
 */
@AllArgsConstructor
public abstract class Country {

    protected UnionNation un;

    public void send(String message) {
        un.send(message, this);
    }

    public abstract void notifyMsg(String message);
}
