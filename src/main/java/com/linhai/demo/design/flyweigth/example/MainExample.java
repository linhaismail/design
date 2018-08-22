package com.linhai.demo.design.flyweigth.example;

/**
 * @description: 享元模式：运用共享技术有效地支持大量的细粒度对象
 * @author: LinHai
 * @create: 2018-08-22 15:28
 */
public class MainExample {

    public static void main(String[] args) {

        // 代码外部状态
        int extrinsicState = 22;

        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();

        FlyWeight fx = flyWeightFactory.getFlyWeight("X");
        fx.operation(--extrinsicState);

        FlyWeight fy = flyWeightFactory.getFlyWeight("Y");
        fy.operation(--extrinsicState);

        FlyWeight fz = flyWeightFactory.getFlyWeight("Z");
        fz.operation(--extrinsicState);

        UnsharedConcreteFlyWeight unf = new UnsharedConcreteFlyWeight();
        unf.operation(--extrinsicState);
    }
}
