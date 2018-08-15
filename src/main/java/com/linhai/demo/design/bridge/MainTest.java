package com.linhai.demo.design.bridge;

/**
 * @description: 桥接模式：合成/聚合复用原则CARP，尽量使用CARP，不要使用继承
 * @author: LinHai
 * @create: 2018-08-15 16:27
 */
public class MainTest {

    public static void main(String[] args) {

        HandsetBrand hb = new BrandA("苹果");
        hb.setSoft(new Music());
        hb.run();
    }
}
