package com.linhai.demo.design.bridge;

/**
 * @description: 手机品牌
 * @author: LinHai
 * @create: 2018-08-15 16:34
 */
public abstract class HandsetBrand {

    String name;
    protected HandsetSoft handsetSoft;

    public HandsetBrand(String name) {
        this.name = name;
    }

    public void setSoft(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    public abstract void run();
}
