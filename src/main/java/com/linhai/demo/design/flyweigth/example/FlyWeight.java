package com.linhai.demo.design.flyweigth.example;

/**
 * @description: 所有具体享元类的超类或接口，通过这个接口，FlyWeight可以接受并作用于外部状态
 * @author: LinHai
 * @create: 2018-08-22 15:30
 */
public abstract class FlyWeight {

    public abstract void operation(int extrinsicState);
}
