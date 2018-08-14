package com.linhai.demo.design.adapter.asexample;

/**
 * @description: 适配器：通过在内部包装一个Adaptee，把源接口转换成目标接口
 * @author: LinHai
 * @create: 2018-08-14 15:59
 */
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.spicificRequest();
    }
}
