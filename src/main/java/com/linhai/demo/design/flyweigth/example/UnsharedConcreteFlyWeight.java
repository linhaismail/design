package com.linhai.demo.design.flyweigth.example;

/**
 * @description: 不共享的具体FlyWeight
 * @author: LinHai
 * @create: 2018-08-22 16:37
 */
public class UnsharedConcreteFlyWeight extends FlyWeight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的具体FlyWeight：" + extrinsicState);
    }
}
