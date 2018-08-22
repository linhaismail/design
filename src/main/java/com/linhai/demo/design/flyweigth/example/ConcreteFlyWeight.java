package com.linhai.demo.design.flyweigth.example;

/**
 * @description: 为内部状态增加存储空间
 * @author: LinHai
 * @create: 2018-08-22 15:34
 */
public class ConcreteFlyWeight extends FlyWeight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("具体FlyWeight：" + extrinsicState);
    }
}
